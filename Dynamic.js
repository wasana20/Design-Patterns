<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Dynamic Web Page</title>
</head>
<body>
    <header>
        <h1 id="pageTitle">Welcome to My Dynamic Web Page</h1>
    </header>
    
    <main>
        <section>
            <h2>About Us</h2>
            <p id="aboutText">This is the about us section of the web page.</p>
        </section>
        
        <section>
            <h2>Contact Us</h2>
            <p id="contactInfo">Contact information goes here.</p>
        </section>
    </main>
    
    <footer>
        <p>&copy; 2023 Your Web Page Name</p>
    </footer>

    <script>
        // JavaScript code to dynamically modify the content
        document.getElementById("pageTitle").textContent = "Welcome to My Updated Dynamic Web Page";
        document.getElementById("aboutText").textContent = "We are a dynamic team creating web content.";
        document.getElementById("contactInfo").textContent = "Email: contact@example.com";
    </script>
</body>
</html>
