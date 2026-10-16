package com.codegym;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * LoginServlet - Xử lý request POST từ form đăng nhập
 * LƯU Ý: Tomcat 10+ dùng jakarta.servlet.* thay vì javax.servlet.*
 */
@WebServlet(name = "LoginServlet", urlPatterns = {"/login"})
public class LoginServlet extends HttpServlet {

    // Sử dụng doPost để bắt dữ liệu từ form có method="POST"
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Cấu hình phản hồi: HTML + UTF-8 để hiển thị tiếng Việt
        response.setContentType("text/html;charset=UTF-8");

        // 1. Lấy dữ liệu người dùng nhập từ Form (thông qua thuộc tính 'name')
        String user = request.getParameter("username");
        String pass = request.getParameter("password");

        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html lang='vi'>");
            out.println("<head>");
            out.println("    <meta charset='UTF-8'>");
            out.println("    <title>Login Result</title>");
            out.println("    <style>");
            out.println("        body { font-family: 'Segoe UI', Arial, sans-serif;");
            out.println("               text-align: center; margin-top: 100px;");
            out.println("               background: linear-gradient(135deg, #667eea, #764ba2);");
            out.println("               min-height: 100vh; color: white; }");
            out.println("        .result-card { background: rgba(255,255,255,0.15);");
            out.println("                       padding: 40px; border-radius: 15px;");
            out.println("                       display: inline-block; backdrop-filter: blur(10px); }");
            out.println("        h1 { font-size: 32px; margin-bottom: 20px; }");
            out.println("        .success { color: #2ecc71; }");
            out.println("        .error { color: #e74c3c; }");
            out.println("        a { color: #ffeb3b; text-decoration: none;");
            out.println("            font-weight: bold; }");
            out.println("        a:hover { text-decoration: underline; }");
            out.println("    </style>");
            out.println("</head>");
            out.println("<body>");
            out.println("    <div class='result-card'>");

            // 2. Kiểm tra điều kiện logic (Hardcode admin/admin theo yêu cầu)
            if ("admin".equals(user) && "admin".equals(pass)) {
                out.println("<h1 class='success'>✅ Welcome admin to website</h1>");
            } else {
                out.println("<h1 class='error'>❌ Login Error</h1>");
                out.println("<p>Tên đăng nhập hoặc mật khẩu không đúng!</p>");
            }

            out.println("        <br><br>");
            out.println("        <a href='index.jsp'>← Quay lại trang đăng nhập</a>");
            out.println("    </div>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}