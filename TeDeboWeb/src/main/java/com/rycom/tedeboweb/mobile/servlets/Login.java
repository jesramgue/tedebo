/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rycom.tedeboweb.mobile.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author usuario
 */
public class Login extends HttpServlet {

    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            response.setContentType("text/html;charset=UTF-8");
            out = response.getWriter();
            //try {
                String jsonString = request.getParameter("json");
                /**
                 * JSON-->DB
                 */
//                Sessionresult lsrResult = new Sessionresult();
//                lsrResult.setDate(Calendar.getInstance().getTime());
//                lsrResult.setJsonFile(jsonString);
//                JSONParser parser = new JSONParser();
//
//                /**********************************************************/
//                try {
//                    obj = parser.parse(jsonString);
//                } catch (ParseException ex) {
//                    Logger.getLogger(setSessionResult.class.getName()).log(Level.SEVERE, null, ex);
//                }

                out.println("OK");
                /* TODO output your page here
                out.println("<html>");
                out.println("<head>");
                out.println("<title>Servlet Login</title>");  
                out.println("</head>");
                out.println("<body>");
                out.println("<h1>Servlet Login at " + request.getContextPath () + "</h1>");
                out.println("</body>");
                out.println("</html>");
                 */
            } finally {
                out.close();
            }
        }

        // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
        /** 
         * Handles the HTTP <code>GET</code> method.
         * @param request servlet request
         * @param response servlet response
         * @throws ServletException if a servlet-specific error occurs
         * @throws IOException if an I/O error occurs
         */
        @Override
        protected void doGet
        (HttpServletRequest request, HttpServletResponse response
        )
            throws ServletException
        , IOException {
            processRequest(request, response);
        }

        /** 
         * Handles the HTTP <code>POST</code> method.
         * @param request servlet request
         * @param response servlet response
         * @throws ServletException if a servlet-specific error occurs
         * @throws IOException if an I/O error occurs
         */
        @Override
        protected void doPost
        (HttpServletRequest request, HttpServletResponse response
        )
            throws ServletException
        , IOException {
            processRequest(request, response);
        }

        /** 
         * Returns a short description of the servlet.
         * @return a String containing servlet description
         */
        @Override
        public String getServletInfo
        
            () {
        return "Short description";
        }// </editor-fold>
    }
