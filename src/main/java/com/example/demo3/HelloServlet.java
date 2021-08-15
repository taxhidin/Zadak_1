package com.example.demo3;

import java.io.*;
import java.util.Scanner;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
    }

    public void destroy() {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        /*    Napraviti web aplikaciju koja računa koliko je sati potrebno raditi da bi
    zaradili neki iznos. Omogućiti unos mjesečne neto plaće, broj radnih dana u
    mjesecu i iznos. Pretpostavljamo da se svaki dan radi 8 sati. Nakon unosa
    aplikacija treba prikazati koliko je sati potrebno raditi da bi zaradili
    uneseni iznos. Ako je broj sati veći od 8, rješenje treba prikazati
    kao "X dana i Y sati".
    Podatke nije potrebno spremati u bazu. Možete koristiti bilo koji programski
    jezik i tehnologije. */

        double salary, work_days, cost_product;

        salary = Double.valueOf(request.getParameter("neto"));
        work_days = Double.valueOf(request.getParameter("radih"));
        cost_product =Double.valueOf(request.getParameter("iznos"));
        double v =calculate (cost_product, work_days, salary);


            request.setAttribute("neto", salary);
            request.setAttribute("radih", work_days);
            request.setAttribute("iznos", cost_product);
            request.setAttribute("calculation", v);

            request.getRequestDispatcher("result.jsp").forward(request, response);







/*        Ako je broj sati veći od 8, rješenje treba prikazati
        kao "X dana i Y sati".*/

    }

    private double calculate(double cost_product_1, double work_days_2, double salary_3) {

        double work_product_hours = (cost_product_1 * work_days_2)/(salary_3);
        return work_product_hours;
    }


}