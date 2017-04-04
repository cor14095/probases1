jQuery(document).ready(function(){
	var path = "../../../antlr/output/data.csv";
	//the following is the wrong way
	var path = "../static/data.csv"

	csv2Table(path);
});

function csv2Table(path){
	d3.text(path,function(data){
		console.log(data)
		var parsedCSV = d3.csvParseRows(data);
		var container = d3.select("#table")
            .append("table")
 
            .selectAll("tr")
            .data(parsedCSV).enter()
            .append("tr")
 
			.selectAll("td")
            .data(function(d) { return d; }).enter()
            .append("td")
            .text(function(d) { return d; });

	});
}