var fetch = angular.module("userApp", []);
	fetch.controller("userController", ["$scope", "$http", function ($scope, $http) {
		$http.get("")
			.success(function(data){
				$scope.data = data;
			})
			.error(function() {
				$scope.data = "error in fetching data";
			});
	}]);
		