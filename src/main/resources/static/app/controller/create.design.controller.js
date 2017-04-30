/**
 * Created by Sakshi Kukreti on 30-04-2017.
 */
angular.module('app')
    .controller('createDesignController', function ($scope, $state, designService) {
        $scope.design = {};
        $scope.design.designNum = '';
        $scope.design.author = 'random';

        $scope.saveDesign = function () {
            var array = [];
            array.push($scope.design);
            $scope.showLoader = true;
            designService
                .saveChanges(array)
                .then(function (response) {
                    $scope.showLoader = false;
                    console.log("created new design", response);
                    $state.go('homeState');
                });

        };
    });