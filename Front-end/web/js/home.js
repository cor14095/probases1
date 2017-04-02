jQuery(document).ready(function(){
	console.log(jQuery("#file"));
	jQuery("#file").on("change",function(){isFileLoaded();});
});

function isFileLoaded(){
	if(jQuery("#file").val()){
		console.log("sirve");
		jQuery("#btn-load").removeAttr('disabled');
	}
}