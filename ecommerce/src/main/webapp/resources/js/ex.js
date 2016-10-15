
angular.module('myApp', []).controller('namesCtrl', function($scope) {
    $scope.names = [
        {name:'Jani',brand:'lg'},
        {name:'Carl',brand:'lg'},
        {name:'Margareth',brand:'lg'},
        {name:'Hege',brand:'lg'},
        {name:'Joe',brand:'index'},
        {name:'Gustav',brand:'Sweden'},
        {name:'Birgit',brand:'Denmark'},
        {name:'Mary',brand:'England'},
        {name:'Kai',brand:'Norway'}
        ];
    $scope.orderByMe = function(x) {
        $scope.myOrderBy = x;
    }
});