package com.example.ee;

import java.io.*;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;


@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");

        HttpSession session = request.getSession();
        Integer count = (Integer) session.getAttribute("count");
        if (count == null) {session.setAttribute("count", 1); count = 1;}
        else  session.setAttribute("count", count + 1);

        String []mas = new String[10];
        mas [0] = "Возможности программирования всегда были ограничены либо воз-можностя¬ми компьютера, либо возможностями человека. ";
        mas [1] = "В прошлом веке главным ограни¬чением были низкие производительные способности компь-ютера. ";
        mas [2] = "В настоящее время физические ограничения отошли на второй план. " ;
        mas [3] = "Со всё более глубоким проникновением компьютеров во все сферы челове-ческой деятельности, программные системы становятся всё более простыми для пользователя и сложными по внутренней архитектуре. " ;
        mas [4] = "Программирование стало  делом команды и на смену алгоритмическим идеологиям про-граммирования пришли эвристические, позволяющие достичь положитель-ного результата различными путями.";
        mas [5] = "Объектно-ориентированный язык Java, разработанный в Sun Microsys-tems, предназначен для создания переносимых на различные платформы и опера¬ционные системы программ. " ;
        mas [6] = "Язык Java нашел широкое применение в Интернет-приложениях, добавив на статические и клиентские Web-страницы динамическую графику, улучшив интерфейсы и реализовав вычислительные возможности. " ;
        mas [7] = "Но объектно-ориентированная парадигма и кроссплатформен-ность привели к тому, что уже буквально через несколько лет после своего создания язык практически покинул клиентские страницы и перебрался на сервера. " ;
        mas [8] = "На стороне клиента его место занял язык JavaScript.";
        mas [9] = "В Java все объекты программы расположены в динамической памяти – куче (heap) и доступны по объектным ссылкам, которые, в свою очередь, хранятся в стеке (stack).";

        // Hello
        PrintWriter out = response.getWriter();
        String px = request.getParameter("px");
        String color = request.getParameter("color");
        String kol = request.getParameter("kol");
        out.println("<html>");
        for(int i = 0; i < Integer.parseInt(kol); i++){

            out.println("<p style=\"color: " + color +  "; font-size: " + px + "px;\">" + mas[i] +  "</p>");
        }

        //out.println("<p>Your count is " + count +  "</p>");
        out.println("</html>");

       // RequestDispatcher dispatcher = request.getRequestDispatcher("/second");
        //dispatcher.forward(request, response);
        //response.sendRedirect("/EE_war_exploded/second");
    }

    public void destroy() {
    }
}