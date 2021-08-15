<%--
  Created by IntelliJ IDEA.
  User: Taxhidin
  Date: 8/14/2021
  Time: 6:43 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculator Result</title>
</head>
<body>

<h1>Calculation result</h1>

<div>
<h3>

    <script>
        let value = ${calculation};

        if ( value % 8 == 0) {
        const value_first = Math.floor(value);

        document.write("potrebno je da raditi" + value_first + "dana");

    }

    else{

            const value_second = Math.floor(value);

            let end = value % 8;

            document.write( "potrebno je da raditi " + value_second + " dana i "+end+ " sati");


    }
    </script>
</h3>

</div>
</body>
</html>
