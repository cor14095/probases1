jQuery(document).ready(function(){
	jQuery("#file").on("change",function(){isFileLoaded();});
	//showDb();
	insertOptions("no");
});

function isFileLoaded(){
	if(jQuery("#file").val()){
		console.log("sirve");
		jQuery("#btn-load").removeAttr('disabled');
	}
}

function showDb(){
	jQuery.ajax({
		type: 'POST',
		contentType: "application/xml; charset=utf-8",
		url: "main",
		data: "show databases",
   		success: function(response) {
   			console.log(response);
   			//insertOptions(response);
   		}
	});
}

function insertOptions(response){
	var response = "../static/data.csv";
	var select = jQuery("#file");
	d3.csv(response, function(data) {
		var dataValues = d3.values(data)[0];
		var dataArray = (Object.keys(dataValues));
		var dataLength = dataArray.length;
		for(var i = 0; i<dataLength; i++){
			select.append(new Option(dataArray[i], dataArray[i]));
		}
	});
}