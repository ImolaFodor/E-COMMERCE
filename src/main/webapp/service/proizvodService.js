app.service('proizvodService', function($http){
	return {
		getProizvodi: function(prodavnicaId, onSuccess, onError){
			$http.get("proizvodi/"+prodavnicaId).then(onSuccess, onError);
		}
	}
});