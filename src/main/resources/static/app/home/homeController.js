angular.module("smallapp").controller("homeController", ['userService', '$scope',function(userService, $scope){
	$scope.user =  JSON.parse(userService.getLoggedUser()).user;

	// method for logout	
	$scope.logout = function(){
		userService.logout();
	}
	
	
}]);