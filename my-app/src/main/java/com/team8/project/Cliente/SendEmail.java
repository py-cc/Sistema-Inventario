package com.team8.project.Cliente;

import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.commons.mail.*;

import java.io.File;

import java.util.*;

public class SendEmail {

    public static void SendList(ArrayList<String> inventario){

        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("com/team8/project/Inventario");

        sheet.setColumnWidth(0, 12000);
        sheet.setColumnWidth(1, 12000);


        // Fila
        int positionRow = 1;
        // Contenido Inventario
        int inside = 0;

        Row row = sheet.createRow((short) positionRow);
        Cell cell = row.createCell((short) positionRow);


        row = sheet.createRow((short) 0);
        row.createCell(0).setCellValue("PRODUCTO");
        row.createCell(1).setCellValue("CANTIDAD");


        int breakPoint = inventario.size();

        for (int i = 0; i<inventario.size(); i++){
                if(positionRow != 0){
                    row = sheet.createRow((short) positionRow);
                }
            for (int j = 0; j<inventario.size(); j++) {
                if(inside == breakPoint){
                    break;
                }
                row.createCell(j).setCellValue(inventario.get(inside));
                inside++;
                if(j%2 == 1 && j != 0){
                    positionRow++;
                    break;
                }
            }
        }

        try
        {
            //Write the workbook in file system
            FileOutputStream out = new FileOutputStream(new File("Inventario.xlsx"));
            workbook.write(out);
            out.close();
            System.out.println("Inventario.xlsx Se creo y escribio correctamente.");
            MultiPartEmail email = new MultiPartEmail();
            //email.setAuthentication();
            String authuser = "correoque@corresponda";
            String authpwd = "contraseñaquecorresponda";

            email.setAuthenticator(new DefaultAuthenticator(authuser, authpwd));

            email.setHostName("smtp.gmail.com");
            email.setDebug(true);
            email.setSmtpPort(587);
            email.setSSLOnConnect(true);
            email.getMailSession().getProperties().put("mail.smtps.auth", "true");
            email.getMailSession().getProperties().put("mail.debug", "true");
            email.getMailSession().getProperties().put("mail.smtps.port", "587");
            email.getMailSession().getProperties().put("mail.smtps.socketFactory.port", "587");
            email.getMailSession().getProperties().put("mail.smtps.socketFactory.class",   "javax.net.ssl.SSLSocketFactory");
            email.getMailSession().getProperties().put("mail.smtps.socketFactory.fallback", "false");
            email.getMailSession().getProperties().put("mail.smtp.starttls.enable", "true");

            email.attach(new File("C:\\Users\\User\\Documents\\test_maven2\\my-app\\Inventario.xlsx"));

            Scanner input = new Scanner(System.in);
            System.out.println("Ingrese correo electronico para enviar Documento: ");
            String userEmail = input.nextLine();
            email.addTo(userEmail);

            email.setFrom("paolacarrero731@gmail.com", "Paola Carrero");
            email.setSubject("Archivo Inventario");
            email.setMsg("El siguiente adjunto corresponde al Inventario generado");
            email.send();
            System.out.println("Correo enviado con exito");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}

