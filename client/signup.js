document.getElementById("submitButton").addEventListener("click", function() {
    const firstname = document.getElementById("firstname").value;
    const lastname = document.getElementById("lastname").value;
    const username = document.getElementById("username").value;
    const password = document.getElementById("password").value;
    const email = document.getElementById("email").value;
    const number = document.getElementById("number").value;

    console.log(firstname);
    console.log(lastname);
    console.log(username);
    console.log(password);
    console.log(email);
    console.log(number);


    //datbasecolumanname : text box value
    const peoples = {
      firstname: firstname,
      lastname: lastname,
      username:username,
      password: password,
      email:email,
      number:number
    }
    console.log(peoples)

    const xhr = new XMLHttpRequest();
    xhr.open("POST", "http://localhost:8082/peoples");
    xhr.setRequestHeader("Content-Type" , "application/json");
    xhr.setRequestHeader("Access-Control-Allow-Origin" , "*");

    xhr.onreadystatechange = () => {
      if(xhr.readyState == 4 && xhr.status == 200)
      {
      // const response = JSON.parse(xhr.responseText)
      // console.log(response);
      
      console.log(xhr.responseText)
      }
    }

    xhr.send( JSON.stringify(peoples) );
    window.location.href="http://localhost:5500/FilmVerse/login.html";
  })