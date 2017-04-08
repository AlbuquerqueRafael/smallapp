angular.module("smallapp").controller("loginController", ['userService', '$scope', function(userService, $scope){
	$scope.user = {}
	// method for login
	$scope.login = function() {
		// requesting the token by usename and passoword
		userService.login($scope.user.mail, $scope.user.password).then(function(res) {
				$scope.password = null;		
				// checking if the token is available in the response
				userService.authUser(res)
			}, function errorCallback(response)  {
				console.log(response)
				$scope.messages = []
				// if authentication was not successful. Setting the error message.
				$scope.messages.push(response.data.error)
			});
	};
	
}]);