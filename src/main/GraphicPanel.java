package main;

import javax.swing.*;
import java.awt.*;

import static java.lang.Math.abs;
import static java.lang.Math.sqrt;

public class GraphicPanel extends JPanel {
    private Color graphicColor = Color.GREEN;
    public void paint(Graphics g)
    {
        super.paint(g);
        drawGraphic(g);
        drawGraphic2(g);
        drawGraphic3(g);
        drawGraphic4(g);
        drawGraphic5(g);
        drawGraphic6(g);
    }

//    private void drawGraphic(Graphics g) {
//        g.setColor(graphicColor); // устанавливаем цвет графика
//
////        for(int x=0; x<width; x++){           // делаем цикл с левой стороны экрана до правой
////            int realX = x - width/2;   // так, как слева от оси OX минус, то отнимаем от текущей точки центральную точку
////            double rad = realX/30.0;   // переводим текущую коориднату в радианы, 30 пикселей по ширине == 1 радиану
////            double sin = Math.sin(rad);       // вычисляем синус угла
////            int y = height/2 + (int) (sin * 90);  // переводим значение синуса в координату нашей системы
////            g.fillRoundRect(0, 0, 10, 10,0,0);   // рисуем кружок в этой точке
////            g.fillRoundRect(10, 10, 10, 10,0,0);   // рисуем кружок в этой точке
////        }
//
//        double dx, dy, steps, x, y, k;
//        double xc, yc;
//        double x1 = 0, y1 = getHeight()*2/3, x2 = getWidth()/2, y2 = 0;
//        dx = x2 - x1;
//        dy = y2 - y1;
//        if (abs(dx) > abs(dy))
//            steps = abs(dx);
//        else
//            steps = abs(dy);
//        xc = (dx / steps);
//        yc = (dy / steps);
//        x = x1;
//        y = y1;
//        g.fillRect(0, getHeight()*2/3, 10, 10);
//        for (k = 1; k <= steps; k++) {
//            x = x + xc;
//            y = y + yc;
//            g.fillRect((int) x, (int) y, 10, 10);
//        }
//    }
//
//    private void drawGraphic2(Graphics g) {
//        g.setColor(graphicColor); // устанавливаем цвет графика
//
////        for(int x=0; x<width; x++){           // делаем цикл с левой стороны экрана до правой
////            int realX = x - width/2;   // так, как слева от оси OX минус, то отнимаем от текущей точки центральную точку
////            double rad = realX/30.0;   // переводим текущую коориднату в радианы, 30 пикселей по ширине == 1 радиану
////            double sin = Math.sin(rad);       // вычисляем синус угла
////            int y = height/2 + (int) (sin * 90);  // переводим значение синуса в координату нашей системы
////            g.fillRoundRect(0, 0, 10, 10,0,0);   // рисуем кружок в этой точке
////            g.fillRoundRect(10, 10, 10, 10,0,0);   // рисуем кружок в этой точке
////        }
//
//        double dx, dy, steps, x, y, k;
//        double xc, yc;
//        double x1 = 0, y1 = getHeight()*2/3, x2 = getWidth(), y2 = getHeight()*2/3;
//        dx = x2 - x1;
//        dy = y2 - y1;
//        if (abs(dx) > abs(dy))
//            steps = abs(dx);
//        else
//            steps = abs(dy);
//        xc = (dx / steps);
//        yc = (dy / steps);
//        x = x1;
//        y = y1;
//        g.fillOval(0, getHeight()*2/3, 10, 10);
//        for (k = 1; k <= steps; k++) {
//            x = x + xc;
//            y = y + yc;
//            g.fillOval((int) x, (int) y, 10, 10);
//        }
//    }
//    private void drawGraphic3(Graphics g) {
//        g.setColor(graphicColor); // устанавливаем цвет графика
//
////        for(int x=0; x<width; x++){           // делаем цикл с левой стороны экрана до правой
////            int realX = x - width/2;   // так, как слева от оси OX минус, то отнимаем от текущей точки центральную точку
////            double rad = realX/30.0;   // переводим текущую коориднату в радианы, 30 пикселей по ширине == 1 радиану
////            double sin = Math.sin(rad);       // вычисляем синус угла
////            int y = height/2 + (int) (sin * 90);  // переводим значение синуса в координату нашей системы
////            g.fillRoundRect(0, 0, 10, 10,0,0);   // рисуем кружок в этой точке
////            g.fillRoundRect(10, 10, 10, 10,0,0);   // рисуем кружок в этой точке
////        }
//
//        double dx, dy, steps, x, y, k;
//        double xc, yc;
//        double x1 = getWidth()/2, y1 = 0, x2 = getWidth(), y2 = getHeight()*2/3;
//        dx = x2 - x1;
//        dy = y2 - y1;
//        if (abs(dx) > abs(dy))
//            steps = abs(dx);
//        else
//            steps = abs(dy);
//        xc = (dx / steps);
//        yc = (dy / steps);
//        x = x1;
//        y = y1;
//        g.fillOval(getWidth()/2, 0, 10, 10);
//        for (k = 1; k <= steps; k++) {
//            x = x + xc;
//            y = y + yc;
//            g.fillOval((int) x, (int) y, 10, 10);
//        }
//    }

    private void drawGraphic(Graphics g) {
        g.setColor(graphicColor); // устанавливаем цвет графика
        double a=(4*getHeight())/(3*Math.sqrt(3));
        double dx, dy, steps, x, y, k;
        double xc, yc;
        double x1 = (getWidth()-a)/2, y1 = getHeight()*2/3, x2 = getWidth()/2, y2 = 0;
        dx = x2 - x1;
        dy = y2 - y1;
        if (abs(dx) > abs(dy))
            steps = abs(dx);
        else
            steps = abs(dy);
        xc = (dx / steps);
        yc = (dy / steps);
        x = x1;
        y = y1;
        g.fillRect(Integer.valueOf(String.valueOf(Math.round((getWidth()-a)/2))),  Math.round(getHeight()/3), 10, 10);
        for (k = 1; k <= steps; k++) {
            x = x + xc;
            y = y + yc;
            g.fillRect((int) Math.round(x), (int) Math.round(y), 10, 10);
        }
    }

    private void drawGraphic2(Graphics g) {
        g.setColor(graphicColor); // устанавливаем цвет графика
        double a=(4*getHeight())/(3*Math.sqrt(3));
        double dx, dy, steps, x, y, k;
        double xc, yc;
        double x1 = (getWidth()-a)/2, y1 =  getHeight()*2/3, x2 = getWidth()-(getWidth()-a)/2, y2 = getHeight()*2/3;
        dx = x2 - x1;
        dy = y2 - y1;
        if (abs(dx) > abs(dy))
            steps = abs(dx);
        else
            steps = abs(dy);
        xc = (dx / steps);
        yc = (dy / steps);
        x = x1;
        y = y1;
        g.fillOval(Integer.valueOf(String.valueOf(Math.round((getWidth()-a)/2))),  Math.round(getHeight()/3), 10, 10);
        for (k = 1; k <= steps; k++) {
            x = x + xc;
            y = y + yc;
            g.fillOval((int) Math.round(x), (int) Math.round(y), 10, 10);
        }
    }
    private void drawGraphic3(Graphics g) {
        g.setColor(graphicColor); // устанавливаем цвет графика
        double a=(4*getHeight())/(3*Math.sqrt(3));
        double dx, dy, steps, x, y, k;
        double xc, yc;
        double x1 = getWidth()/2, y1 = 0, x2 = getWidth()-(getWidth()-a)/2, y2 = getHeight()*2/3;
        dx = x2 - x1;
        dy = y2 - y1;
        if (abs(dx) > abs(dy))
            steps = abs(dx);
        else
            steps = abs(dy);
        xc = (dx / steps);
        yc = (dy / steps);
        x = x1;
        y = y1;
        g.fillOval(getWidth()/2, Integer.valueOf(String.valueOf(Math.round(getHeight()- sqrt(3)*( getWidth()-abs(getHeight()-getWidth()))/2))), 10, 10);
        for (k = 1; k <= steps; k++) {
            x = x + xc;
            y = y + yc;
            g.fillOval((int) Math.round(x), (int) Math.round(y), 10, 10);
        }
    }


    private void drawGraphic4(Graphics g) {
        g.setColor(Color.RED); // устанавливаем цвет графика

//        for(int x=0; x<width; x++){           // делаем цикл с левой стороны экрана до правой
//            int realX = x - width/2;   // так, как слева от оси OX минус, то отнимаем от текущей точки центральную точку
//            double rad = realX/30.0;   // переводим текущую коориднату в радианы, 30 пикселей по ширине == 1 радиану
//            double sin = Math.sin(rad);       // вычисляем синус угла
//            int y = height/2 + (int) (sin * 90);  // переводим значение синуса в координату нашей системы
//            g.fillRoundRect(0, 0, 10, 10,0,0);   // рисуем кружок в этой точке
//            g.fillRoundRect(10, 10, 10, 10,0,0);   // рисуем кружок в этой точке
//        }
        double a=(4*getHeight())/(3*Math.sqrt(3));
        double dx, dy, steps, x, y, k;
        double xc, yc;
        double x1 = getWidth()/2, y1 = getHeight(),x2=getWidth()-(getWidth()-a)/2 ,y2 = getHeight()/3;
        dx = x2 - x1;
        dy = y2 - y1;
        if (abs(dx) > abs(dy))
            steps = abs(dx);
        else
            steps = abs(dy);
        xc = (dx / steps);
        yc = (dy / steps);
        x = x1;
        y = y1;
        g.fillRect(getWidth()/2, getHeight(), 20, 20);
        for (k = 1; k <= steps; k++) {
            x = x + xc;
            y = y + yc;
            g.fillRect((int) x, (int) y, 20, 20);
        }
    }

    private void drawGraphic5(Graphics g) {
        g.setColor(Color.RED); // устанавливаем цвет графика
        double a=(4*getHeight())/(3*Math.sqrt(3));
        double dx, dy, steps, x, y, k;
        double xc, yc;
        double x1 = (getWidth()-a)/2, y1 = getHeight()/3, x2 = getWidth()-(getWidth()-a)/2, y2 = getHeight()/3;
        dx = x2 - x1;
        dy = y2 - y1;
        if (abs(dx) > abs(dy))
            steps = abs(dx);
        else
            steps = abs(dy);
        xc = (dx / steps);
        yc = (dy / steps);
        x = x1;
        y = y1;
        g.fillRect(Integer.valueOf(String.valueOf(Math.round((getWidth()-a)/2))), Math.round(getHeight()/3), 20, 20);
        for (k = 1; k <= steps; k++) {
            x = x + xc;
            y = y + yc;
            g.fillRect((int) Math.round(x), (int) Math.round(y), 20, 20);
        }
    }
    private void drawGraphic6(Graphics g) {
        g.setColor(Color.RED); // устанавливаем цвет графика
        double a=(4*getHeight())/(3*Math.sqrt(3));
        double dx, dy, steps, x, y, k;
        double xc, yc;
        double x1 = (getWidth()-a)/2, y1 = getHeight()/3, x2 = getWidth()/2, y2 = getHeight();
        dx = x2 - x1;
        dy = y2 - y1;
        if (abs(dx) > abs(dy))
            steps = abs(dx);
        else
            steps = abs(dy);
        xc = (dx / steps);
        yc = (dy / steps);
        x = x1;
        y = y1;
        g.fillRect(Integer.valueOf(String.valueOf(Math.round((getWidth()-a)/2))), getHeight(), 20, 20);
        for (k = 1; k <= steps; k++) {
            x = x + xc;
            y = y + yc;
            g.fillRect((int) Math.round(x), (int) Math.round(y), 20, 20);
        }
    }

/*    private void drawGraphic4(Graphics g) {
        g.setColor(Color.RED); // устанавливаем цвет графика

//        for(int x=0; x<width; x++){           // делаем цикл с левой стороны экрана до правой
//            int realX = x - width/2;   // так, как слева от оси OX минус, то отнимаем от текущей точки центральную точку
//            double rad = realX/30.0;   // переводим текущую коориднату в радианы, 30 пикселей по ширине == 1 радиану
//            double sin = Math.sin(rad);       // вычисляем синус угла
//            int y = height/2 + (int) (sin * 90);  // переводим значение синуса в координату нашей системы
//            g.fillRoundRect(0, 0, 10, 10,0,0);   // рисуем кружок в этой точке
//            g.fillRoundRect(10, 10, 10, 10,0,0);   // рисуем кружок в этой точке
//        }

        double dx, dy, steps, x, y, k;
        double xc, yc;
        double x1 = getWidth()/2, y1 = sqrt(3)*( getWidth()-abs(getHeight()-getWidth()))/2, x2 = getWidth()-abs(getHeight()-getWidth())/2, y2 = getHeight()/3;
        dx = x2 - x1;
        dy = y2 - y1;
        if (abs(dx) > abs(dy))
            steps = abs(dx);
        else
            steps = abs(dy);
        xc = (dx / steps);
        yc = (dy / steps);
        x = x1;
        y = y1;
        g.fillRect(getWidth()/2, Integer.valueOf(String.valueOf(Math.round(sqrt(3)*( getWidth()-abs(getHeight()-getWidth()))/2))), 20, 20);
        for (k = 1; k <= steps; k++) {
            x = x + xc;
            y = y + yc;
            g.fillRect((int) x, (int) y, 20, 20);
        }
    }

    private void drawGraphic5(Graphics g) {
        g.setColor(Color.RED); // устанавливаем цвет графика

//        for(int x=0; x<width; x++){           // делаем цикл с левой стороны экрана до правой
//            int realX = x - width/2;   // так, как слева от оси OX минус, то отнимаем от текущей точки центральную точку
//            double rad = realX/30.0;   // переводим текущую коориднату в радианы, 30 пикселей по ширине == 1 радиану
//            double sin = Math.sin(rad);       // вычисляем синус угла
//            int y = height/2 + (int) (sin * 90);  // переводим значение синуса в координату нашей системы
//            g.fillRoundRect(0, 0, 10, 10,0,0);   // рисуем кружок в этой точке
//            g.fillRoundRect(10, 10, 10, 10,0,0);   // рисуем кружок в этой точке
//        }

        double dx, dy, steps, x, y, k;
        double xc, yc;
        double x1 = abs(getHeight()-getWidth())/2, y1 = getHeight()/3, x2 = getWidth()-x1, y2 = getHeight()/3;
        dx = x2 - x1;
        dy = y2 - y1;
        if (abs(dx) > abs(dy))
            steps = abs(dx);
        else
            steps = abs(dy);
        xc = (dx / steps);
        yc = (dy / steps);
        x = x1;
        y = y1;
        g.fillRect(abs(getHeight()-getWidth())/2, getHeight()/3, 20, 20);
        for (k = 1; k <= steps; k++) {
            x = x + xc;
            y = y + yc;
            g.fillRect((int) x, (int) y, 20, 20);
        }
    }
    private void drawGraphic6(Graphics g) {
        g.setColor(Color.RED); // устанавливаем цвет графика

//        for(int x=0; x<width; x++){           // делаем цикл с левой стороны экрана до правой
//            int realX = x - width/2;   // так, как слева от оси OX минус, то отнимаем от текущей точки центральную точку
//            double rad = realX/30.0;   // переводим текущую коориднату в радианы, 30 пикселей по ширине == 1 радиану
//            double sin = Math.sin(rad);       // вычисляем синус угла
//            int y = height/2 + (int) (sin * 90);  // переводим значение синуса в координату нашей системы
//            g.fillRoundRect(0, 0, 10, 10,0,0);   // рисуем кружок в этой точке
//            g.fillRoundRect(10, 10, 10, 10,0,0);   // рисуем кружок в этой точке
//        }

        double dx, dy, steps, x, y, k;
        double xc, yc;
        double x1 = abs(getHeight()-getWidth())/2, y1 = getHeight()/3, x2 = getWidth()/2, y2 = sqrt(3)*( getWidth()-abs(getHeight()-getWidth()))/2;
        dx = x2 - x1;
        dy = y2 - y1;
        if (abs(dx) > abs(dy))
            steps = abs(dx);
        else
            steps = abs(dy);
        xc = (dx / steps);
        yc = (dy / steps);
        x = x1;
        y = y1;
        g.fillRect(abs(getHeight()-getWidth())/2, getHeight()/3, 20, 20);
        for (k = 1; k <= steps; k++) {
            x = x + xc;
            y = y + yc;
            g.fillRect((int) x, (int) y, 20, 20);
        }
    }*/



//    private void drawGraphic(Graphics g) {
//        g.setColor(graphicColor); // устанавливаем цвет графика
//
////        for(int x=0; x<width; x++){           // делаем цикл с левой стороны экрана до правой
////            int realX = x - width/2;   // так, как слева от оси OX минус, то отнимаем от текущей точки центральную точку
////            double rad = realX/30.0;   // переводим текущую коориднату в радианы, 30 пикселей по ширине == 1 радиану
////            double sin = Math.sin(rad);       // вычисляем синус угла
////            int y = height/2 + (int) (sin * 90);  // переводим значение синуса в координату нашей системы
////            g.fillRoundRect(0, 0, 10, 10,0,0);   // рисуем кружок в этой точке
////            g.fillRoundRect(10, 10, 10, 10,0,0);   // рисуем кружок в этой точке
////        }
//
//            double dx, dy, steps, x, y, k;
//            double xc, yc;
//            double x1 = 0, y1 = 0, x2 = getWidth(), y2 = 0;
//            dx = x2 - x1;
//            dy = y2 - y1;
//            if (Math.abs(dx) > Math.abs(dy))
//                steps = Math.abs(dx);
//            else
//                steps = Math.abs(dy);
//            xc = (dx / steps);
//            yc = (dy / steps);
//            x = x1;
//            y = y1;
//            g.fillRect(0, 0, 10, 10);
//            for (k = 1; k <= steps; k++) {
//                x = x + xc;
//                y = y + yc;
//                g.fillRect((int) x, (int) y, 10, 10);
//            }
//        }
//
//    private void drawGraphic2(Graphics g) {
//        g.setColor(graphicColor); // устанавливаем цвет графика
//
////        for(int x=0; x<width; x++){           // делаем цикл с левой стороны экрана до правой
////            int realX = x - width/2;   // так, как слева от оси OX минус, то отнимаем от текущей точки центральную точку
////            double rad = realX/30.0;   // переводим текущую коориднату в радианы, 30 пикселей по ширине == 1 радиану
////            double sin = Math.sin(rad);       // вычисляем синус угла
////            int y = height/2 + (int) (sin * 90);  // переводим значение синуса в координату нашей системы
////            g.fillRoundRect(0, 0, 10, 10,0,0);   // рисуем кружок в этой точке
////            g.fillRoundRect(10, 10, 10, 10,0,0);   // рисуем кружок в этой точке
////        }
//
//        double dx, dy, steps, x, y, k;
//        double xc, yc;
//        double x1 = 0, y1 = 0, x2 = getWidth()/2, y2 = getHeight();
//        dx = x2 - x1;
//        dy = y2 - y1;
//        if (Math.abs(dx) > Math.abs(dy))
//            steps = Math.abs(dx);
//        else
//            steps = Math.abs(dy);
//        xc = (dx / steps);
//        yc = (dy / steps);
//        x = x1;
//        y = y1;
//        g.fillOval(0, 0, 10, 10);
//        for (k = 1; k <= steps; k++) {
//            x = x + xc;
//            y = y + yc;
//            g.fillOval((int) x, (int) y, 10, 10);
//        }
//    }
//    private void drawGraphic3(Graphics g) {
//        g.setColor(graphicColor); // устанавливаем цвет графика
//
////        for(int x=0; x<width; x++){           // делаем цикл с левой стороны экрана до правой
////            int realX = x - width/2;   // так, как слева от оси OX минус, то отнимаем от текущей точки центральную точку
////            double rad = realX/30.0;   // переводим текущую коориднату в радианы, 30 пикселей по ширине == 1 радиану
////            double sin = Math.sin(rad);       // вычисляем синус угла
////            int y = height/2 + (int) (sin * 90);  // переводим значение синуса в координату нашей системы
////            g.fillRoundRect(0, 0, 10, 10,0,0);   // рисуем кружок в этой точке
////            g.fillRoundRect(10, 10, 10, 10,0,0);   // рисуем кружок в этой точке
////        }
//
//        double dx, dy, steps, x, y, k;
//        double xc, yc;
//        double x1 = getWidth()/2, y1 = getHeight(), x2 = getWidth(), y2 = 0;
//        dx = x2 - x1;
//        dy = y2 - y1;
//        if (Math.abs(dx) > Math.abs(dy))
//            steps = Math.abs(dx);
//        else
//            steps = Math.abs(dy);
//        xc = (dx / steps);
//        yc = (dy / steps);
//        x = x1;
//        y = y1;
//        g.fillOval(getWidth()/2, getHeight(), 10, 10);
//        for (k = 1; k <= steps; k++) {
//            x = x + xc;
//            y = y + yc;
//            g.fillOval((int) x, (int) y, 10, 10);
//        }
//    }

}
