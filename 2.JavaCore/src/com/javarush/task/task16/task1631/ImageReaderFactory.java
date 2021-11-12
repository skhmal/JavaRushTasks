package com.javarush.task.task16.task1631;

import com.javarush.task.task16.task1631.common.*;

public class ImageReaderFactory {
   private static ImageReader ir;

    public static ImageReader getImageReader(ImageTypes it){
        try {
            if (it.toString().contains("JPG")) {
                ir = new JpgReader();
            } else if (it.toString().contains("PNG")) {
                ir = new PngReader();
            } else if (it.toString().contains("BMP")) {
                ir = new BmpReader();
            }
        }catch (Exception e){System.out.println("Неизвестный тип картинки");
           throw  new IllegalArgumentException();
        }

        return ir;
    }
}
