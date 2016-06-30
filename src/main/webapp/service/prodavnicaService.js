app.service('prodavnicaService', function($http){
	return {
		getProdavnice: function(onSuccess, onError){
			$http.get('/prodavnice').then(onSuccess, onError);
		},
		updateProdavnica: function(prodavnica, onSuccess, onError){
			$http.put('prodavnice/'+prodavnica.id, prodavnica).then(onSuccess, onError);
		},
		saveProdavnica: function(restaurant, onSuccess, onError){
			$http.post('prodavnice', prodavnica).then(onSuccess, onError);
		},
		getOcenaProdavnica: function(prodavnicaId, userId, onSuccess, onError){
			$http.get("prodavnice/ocena/"+prodavnicaId+"/"+userId).then(onSuccess, onError);
		},
		createProdavnica: function(prodavnica, onSuccess, onError){
			$http.post("/prodavnice/", prodavnica).then(onSuccess, onError);
		},
		getProdavnica: function(prodavnicaId, onSuccess, onError){
			$http.get("/prodavnice/"+prodavnicaId).then(onSuccess, onError);
		}		
	}
	
});