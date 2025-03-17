<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Buy Ticket</title>
<style>
    body {
        display: flex;
        justify-content: center;
        align-items: center;
        height: 100vh;
        margin: 0;
        font-family: Arial, sans-serif;
    }
    .wrap {
        text-align: center;
        border: 1px solid #ccc;
        padding: 30px;
        border-radius: 10px;
        box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
    }
    .msg {
        color: #4CAF50;
        margin-top: 10px;
        text-align: center;
    }
    form {
        display: flex;
        flex-direction: column;
        align-items: center;
    }
    label, input {
        margin: 5px 0;
    }
    input[type="text"], input[type="number"] {
        padding: 5px;
        width: 200px;
        border: 1px solid #ccc;
        border-radius: 5px;
    }
    input[type="submit"] {
        padding: 10px 20px;
        border: none;
        border-radius: 5px;
        background-color: #4CAF50;
        color: white;
        cursor: pointer;
        margin-top: 10px;
    }
    input[type="submit"]:hover {
        background-color: #45a049;
    }
</style>
</head>
<body>
    <div class="wrap">
        <h1>Buy a New Ticket</h1>
        <form action="createTicket" method="post">
            <label for="movieName">Movie Name:</label>
            <input type="text" id="movieName" name="movieName" required><br><br>
            
            <label for="screen">Screen:</label>
            <input type="text" id="screenNo" name="screenNo" required><br><br>
            
            <label for="seat">Seat number:</label>
            <input type="text" id="seatNo" name="seatNo" required><br><br>
            
            <input type="submit" value="Buy Ticket">
        </form>
        <div class="msg">
            <p>${msg}</p>
        </div>
    </div>
</body>
</html>