app.controller('prodavnicaController', function($scope, $mdDialog,prodavnica, prodavnicaService, proizvodService, loginService){
	$scope.init = function(){
		loginService.getProfile(function(response){
			$scope.user = response.data;
			$scope.prodavnica=prodavnica;
			console.log($scope.user);
			loadProizvodi();
		});
	}
	
	$scope.search = {};
	
	
	function loadProizvodi(){
		proizvodService.getProizvodi($scope.prodavnica.id,function(response){
			$scope.proizvodi = response.data;
			
			console.log("proizvodi");
			console.log($scope.proizvodi)
		});
	}
	
	$scope.getFilteredTickets = function(){
		ticketService.getTicketsByPriority($scope.user.id, $scope.selected, function(response){
				$scope.filtered_tickets = response.data;
				console.log($scope.filtered_tickets)
			})
	}
	
	$scope.openProdavnicaDetails = function(prodavnica){
		$mdDialog.show({
	          controller: 'prodavnicaController',
	          templateUrl: 'module/prodavnice/prodavnica.html',
	          clickOutsideToClose: true,
	          loggedUser: $scope.user,
	          prodavnica: prodavnica
	       }).then(function(){
	    	  loadProdavnice();
	       });
	}
});