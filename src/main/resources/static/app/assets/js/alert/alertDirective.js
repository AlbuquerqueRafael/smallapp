angular.module('smallapp').directive("alert", function(){
	return {
        templateUrl: '/app/assets/js/alert/alertTemplate.html',
        restrict: "E",
        replace: false,
        transclude: true,
        scope: {
        	messages: '=',
        	type: '@'
        },
        link: function($scope, element, attr){}
    };
	
});
