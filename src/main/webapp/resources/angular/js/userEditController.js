var app = angular.module("userApp", []);
app.controller("userController", function userController($scope,
		userServiceAng) {

	$scope.hello = "hello";

	$scope.data = {

		"username" : undefined,
		"name" : undefined,
		"role" : undefined,
		"active" : undefined,
		"userDelete" : undefined
	};

	$scope.userUsername = function() {
		return userServiceAng.usernameUser($scope.data);
	}

	$scope.userName = function() {
		return userServiceAng.nameUser($scope.data);
	}

	$scope.userRole = function() {
		return userServiceAng.roleUser($scope.data);
	}

	$scope.userActive = function() {
		return userServiceAng.activeUser($scope.data);
	}

	$scope.userDelete = function() {
		return userServiceAng.deleteUser($scope.data);
	}

});

app.factory("userServiceAng", function() {
	var service = {
		usernameUser : usernameUser,
		nameUser : nameUser,
		roleUser : roleUser,
		activeUser : activeUser,
		deleteUser : deleteUser
	};

	function usernameUser(data) {
		var usern = 0;
		angular.forEach(data, function(value) {
			usern = value.username;
		})
		return usern;
	}

	function nameUser(data) {
		var nameu = 0;
		angular.forEach(data, function(value) {
			nameu = value.name;
		})
		return name;
	}

	function roleUser(data) {
		var roleu = 0;
		angular.forEach(data, function(value) {
			roleu = value.role;
		})
		return roleu;
	}

	function activeUser(data) {
		var activeu = 0;
		angular.forEach(data, function(value) {
			activeu = value.active;
		})
		return activeu;
	}

	function deleteUser(data) {
		var deleteu = 0;
		angular.forEach(data, function(value) {
			deleteu = value.userDelete;
		})
		return deleteu;
	}

	return service;
})
