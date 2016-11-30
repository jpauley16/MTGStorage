<div class="container">
    <div class="col-md-12">
        <h2>Login</h2>
    </div>
</div>

<div class="container">
    <div class="col-md-12">
        <FORM ACTION="j_security_check" METHOD="POST">
            <TABLE>
                <TR><TD>User name: <INPUT TYPE="TEXT" NAME="j_username">
                <TR><TD>Password: <INPUT TYPE="PASSWORD" NAME="j_password">
                <TR><TH><INPUT TYPE="SUBMIT" VALUE="Log In">
            </TABLE>
        </FORM>
        <br />
        <p>Or..</p>
        <form id="signUp" action="/sign-up" method="post">
            <h2>Sign Up</h2>
            <br />
            <label for="UserName">Username:</label>
            <input type="text" name="user_name" id="UserName" />
            <br />
            <label for="newPassword">Password:</label>
            <input type="password" name="user_pass" id="newPassword" />
            <br />
            <label for="validatePass">Re-Enter Password:</label>
            <input type="password" id="validatePass"  />
            <br />

            <button type="submit" id="submit" class="submit" name="submit">Sign Up</button>
        </form>
    </div>
</div>