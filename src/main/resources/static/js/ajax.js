$(document).ready(function () {

    $("#userForm").submit(function (event) {

        event.preventDefault();

        var userForm = {}
        userForm["email"] = $("#email").val();
        userForm["password"] = $("#password").val();

        $.ajax({
            type: "POST",
            contentType: "application/json",
            url: "/user",
            data: JSON.stringify(userForm),
            dataType: 'json',
            cache: false,
            timeout: 600000,
            success: function (data) {
                console.log(data);
                var json = "Ajax Response"
                    + JSON.stringify(data, null, 4);
                console.log("SUCCESS  json: ", json);



            },
            error: function (e) {
                console.log("ERROR : ", e);

                var json = "Ajax Error"
                    + e.responseText;
                $('#feedback').html(json);


            }
        });

    });

});