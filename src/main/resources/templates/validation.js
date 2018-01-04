function validateForm() {
	    var x = document.forms["myForm"]["fname"].value;
	    if (x != "kasir") {
	        alert("Username Salah!");
	        return false;
	    }
	    var y = document.forms["myForm"]["fpassword"].value;
	    if (y != "kasir") {
	        alert("Password Salah!");
	        return false;
	    }
	}