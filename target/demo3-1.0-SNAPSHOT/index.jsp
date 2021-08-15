<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>My Calculator</title>
</head>
<body>

<div align="center">
 <h1>Web Calculator</h1>

    <form action="hello-servlet" method="post">


        <p>

           Pisati Neto plaća: <input type="number" name="neto" required/>

        </p>

        <p>

            Pisati broj radnih dana: <input type="number" name="radih" required/>

        </p>

        <p>

            "Pisati iznos: <input type="number" name="iznos" required/>

        </p>

    <p>

        <input type="submit" value="RUN"/>

    </p>


    </form>


</div>



</body>
</html>