/**
 * Created by Sakshi Kukreti on 30-04-2017.
 */
angular.module('app')
    .controller('createDesignController', function ($scope, designService) {
        $scope.design = {};
        $scope.design.designNum = '';
        $scope.design.author = 'random';

        $scope.saveDesign = function () {
            var array = [];
            array.push($scope.design);
            designService
                .saveChanges(array)
                .then(function (response) {
                    console.log("created new design", response);
                });

        }
    });