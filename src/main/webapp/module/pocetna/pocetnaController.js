app.controller('pocetnaController', function($scope, $mdDialog, prodavnicaService, loginService){
	$scope.init = function(){
		loginService.getProfile(function(response){
			$scope.user = response.data;
			console.log($scope.user);
			loadProdavnice();
		});
	}
	
	$scope.search = {};
	
	
	function loadProdavnice(){
		prodavnicaService.getProdavnice(function(response){
			$scope.prodavnice = response.data;
			
			console.log("prodavnice");
			console.log($scope.prodavnice)
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