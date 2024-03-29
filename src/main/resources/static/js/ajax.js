$(document).ready(function () {

    $("#userForm").submit(function (event) {

        event.preventDefault();

        let userForm = {}
        userForm["email"] = $("#email").val();
        userForm["password"] = $("#password").val();
        console.log("userForm: ", userForm)
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
                $('#feedback').html(json);

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