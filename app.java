package com.amudabadmus . awfa;
import net. sourceforge. tess4j.*;
import java.io. *;
 public class app{
public String getImgText(String imageLocation) 
{ 
ITesseract instance = new Tesseract(); 
try { 
String imgText = instance.doOCR(new File(imageLocation)); 
return imgText; 
}
catch (TesseractException e) { 
e.getMessage(); 
return "Error while reading image";
 }
  }
public static void main ( String[] args) { 
app p = new app(); 
System.out.println(p.getImgText("C://Users//Quree Barnwal//Desktop//photo.png"));
 }
  }
