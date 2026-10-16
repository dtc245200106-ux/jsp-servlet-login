<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="vi">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Login Page</title>
        <style>
            * {
                margin: 0;
                padding: 0;
                box-sizing: border-box;
            }
            body {
                font-family: 'Segoe UI', Arial, sans-serif;
                display: flex;
                justify-content: center;
                align-items: center;
                min-height: 100vh;
                background: linear-gradient(135deg, #667eea, #764ba2);
            }
            .login-container {
                background: white;
                padding: 40px;
                border-radius: 12px;
                box-shadow: 0 15px 35px rgba(0, 0, 0, 0.2);
                width: 100%;
                max-width: 380px;
                text-align: center;
            }
            .login-container h2 {
                color: #1b2a7a;
                margin-bottom: 25px;
                font-size: 26px;
            }
            input {
                width: 100%;
                padding: 12px 15px;
                margin: 10px 0;
                border: 1px solid #ccc;
                border-radius: 6px;
                font-size: 15px;
                transition: border-color 0.3s;
            }
            input:focus {
                outline: none;
                border-color: #667eea;
                box-shadow: 0 0 0 3px rgba(102, 126, 234, 0.15);
            }
            button {
                background: linear-gradient(135deg, #667eea, #764ba2);
                color: white;
                padding: 12px;
                border: none;
                border-radius: 6px;
                cursor: pointer;
                width: 100%;
                font-size: 16px;
                font-weight: bold;
                margin-top: 10px;
                transition: all 0.3s;
            }
            button:hover {
                transform: translateY(-2px);
                box-shadow: 0 8px 20px rgba(102, 126, 234, 0.4);
            }
            .hint {
                color: #888;
                font-size: 13px;
                margin-top: 15px;
                font-style: italic;
            }
        </style>
    </head>
    <body>
        <div class="login-container">
            <h2>🔐 System Login</h2>

            <!-- Form gửi dữ liệu bằng phương thức POST tới đường dẫn /login -->
            <form action="login" method="POST">
                <input type="text" name="username"
                       placeholder="Enter username" required autofocus />
                <input type="password" name="password"
                       placeholder="Enter password" required />
                <button type="submit">Login</button>
            </form>

            <p class="hint">💡 Gợi ý: admin / admin</p>
        </div>
    </body>
</html>