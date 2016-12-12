<div class="container">
    <div class="row">
        <div class="col-sm-12">
            <form id="signUp" action="${root}/sign-up" method="post">
                <h2>Sign Up</h2>
                <br />
                <label for="UserName">Username:</label>
                <input type="text" name="user_name" id="UserName" />
                <br />
                <label for="newPassword">Password:</label>
                <input type="password" name="user_pass" id="newPassword" />
                <br />
                <label for="validatePass">Re-Enter Password:</label>
                <input type="password" id="validatePass"  /> <!-- ADD JS FOR PASSWORD VALIDATION -->
                <br />

                <button type="submit" id="submitSignup" class="submit" name="submit">Sign Up</button>
            </form>
        </div>
    </div>
</div>