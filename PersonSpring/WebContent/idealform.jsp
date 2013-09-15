<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="http://code.jquery.com/ui/1.9.0/themes/base/jquery-ui.css" rel="stylesheet"/>
<link href="resources/idealform/css/jquery.idealforms.min.css" rel="stylesheet" media="screen"/>

</head>
<body>
<form id="my-form">

  <!-- TAB -->
  <section name="First tab">

    <!-- Heading -->
    <div>
      <h1>My Heading</h1>
      <p>Description here</p>
    </div>

    <!-- Text -->
    <div><label>Username:</label><input type="text" name="username"/></div>
    <div><label>Date:</label><input type="text" name="date" class="datepicker" placeholder="mm/dd/yy"/></div>
    <div><label>Comments:</label><textarea name="comments"></textarea></div>

    <!-- File -->
    <div><label>File Upload:</label><input type="file" multiple name="file"/></div>

    <!-- Select -->
    <div>
      <label>Colors:</label>
      <select name="colors">
          <option value="default">Choose a color</option>
          <option value="Red">Red</option>
          <option value="Blue">Blue</option>
          <option value="Green">Green</option>
      </select>
    </div>

  </section> <!-- END TAB -->

  <!-- TAB -->
  <section name="Second tab">

    <div>
      <h1>My Heading</h1>
      <p>Description here</p>
    </div>

    <!-- Checkbox -->
    <div>
      <label>Languages:</label>
      <label><input type="checkbox" name="langs[]" value="English"/>English</label>
      <label><input type="checkbox" name="langs[]" value="Chinese"/>Chinese</label>
      <label><input type="checkbox" name="langs[]" value="Spanish"/>Spanish</label>
    </div>

    <!-- Radio -->
    <div>
      <label>Options:</label>
      <label><input type="radio" name="options" value="One"/>One</label>
      <label><input type="radio" name="options" value="Two"/>Two</label>
      <label><input type="radio" name="options" value="Three"/>Three</label>
    </div>

  </section> <!-- END TAB -->

  <!-- Separator -->
  <div><hr/></div>

  <!-- Buttons -->
  <div>
    <button type="submit">Submit</button>
    <button id="reset" type="button">Reset</button>
  </div>

</form>

<script src="http://code.jquery.com/jquery-1.8.2.min.js"></script>
<script src="http://code.jquery.com/ui/1.9.0/jquery-ui.min.js"></script>
<script src="resources/idealform/js/min/jquery.idealforms.js"></script>

<script>
var options = {

	    onFail: function() {
	      alert( $myform.getInvalid().length +' invalid fields.' )
	    },

	    inputs: {
	      'password': {
	        filters: 'required pass',
	      },
	      'username': {
	        filters: 'required username',
	        data: {
	          //ajax: { url:'validate.php' }
	        }
	      },
	      'file': {
	        filters: 'extension',
	        data: { extension: ['jpg'] }
	      },

	      'comments': {
	        filters: 'min max',
	        data: { min: 50, max: 200 }
	      },
	      'states': {
	        filters: 'exclude',
	        data: { exclude: ['default'] },
	        errors : {
	          exclude: 'Select a State.'
	        }
	      },
	      'langs[]': {
	        filters: 'min max',
	        data: { min: 2, max: 3 },
	        errors: {
	          min: 'Check at least <strong>2</strong> options.',
	          max: 'No more than <strong>3</strong> options allowed.'
	        }
	      }
	    }
	  };



  var $myform = $('#my-form').idealforms(options).data('idealforms');
  </script>
</body>
</html>