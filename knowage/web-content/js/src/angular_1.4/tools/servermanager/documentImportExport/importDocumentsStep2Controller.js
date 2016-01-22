angular.module('importExportDocumentModule').controller('importControllerStep2', ["$scope","importExportDocumentModule_importConf","sbiModule_restServices",importStep2FuncController]);

function importStep2FuncController($scope,importExportDocumentModule_importConf,sbiModule_restServices) {

	$scope.manageFirstAssociationsEngines=function(){
		for(var i=0;i<importExportDocumentModule_importConf.engines.exportedEngines.length;i++){
			var index=enginesInList(importExportDocumentModule_importConf.engines.exportedEngines[i],importExportDocumentModule_importConf.engines.currentEngines);
			if(index!=-1){
				importExportDocumentModule_importConf.engines.associatedEngines[importExportDocumentModule_importConf.engines.exportedEngines[i].id]=importExportDocumentModule_importConf.engines.currentEngines[index];
				importExportDocumentModule_importConf.engines.associatedEngines[importExportDocumentModule_importConf.engines.exportedEngines[i].id].fixed=true;
			}else{
				importExportDocumentModule_importConf.engines.associatedEngines[importExportDocumentModule_importConf.engines.exportedEngines[i].id]={};
			}

		}
	}

	function enginesInList(engine,list){
		for(var i in list){
			if(list[i].name==engine.name){
				return i;
			}
		}
		return -1;
	}


	$scope.currentEnginesIsSelectable=function(engine,expEngine){
		var engineinl=enginesInList(engine,importExportDocumentModule_importConf.engines.associatedEngines);
		if(engineinl!=-1 && engineinl!=expEngine.id){
			return false
		}
		return true;	
	}

	function getExportedEngines(){
		var expr=[];
		for(var key in importExportDocumentModule_importConf.engines.associatedEngines){
			expr.push({engineAssociateId:importExportDocumentModule_importConf.engines.associatedEngines[key].id,expEngineId:key});
		}
		return expr;
	}

	$scope.saveEngineAssociation=function(){
		sbiModule_restServices.post("1.0/serverManager/importExport/document", 'associateEngines',getExportedEngines())
		.success(function(data, status, headers, config) {
			console.log("data--->",data)
			if(data.hasOwnProperty("errors")){
				$scope.showToast(data.errors[0].message,4000);
			}else if(data.STATUS=="NON OK"){
				$scope.showToast(data.ERROR,4000);
			}
			else if(data.STATUS=="OK"){
				importExportDocumentModule_importConf.datasources.currentDatasources=data.currentDatasources;
				importExportDocumentModule_importConf.datasources.exportedDatasources=data.exportedDatasources;

				$scope.stepControl.insertBread({name:"datasources"})
			}
		})
		.error(function(data, status, headers, config) {
			$scope.showToast(data,4000);
		});
	}


}
