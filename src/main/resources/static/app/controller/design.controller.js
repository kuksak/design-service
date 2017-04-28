/**
 * Created by Sakshi Kukreti on 27-04-2017.
 */

angular.module('app')
    .controller('designController', function ($scope, designService) {
        $scope.design = {};
        $scope.design.designNum='';
        $scope.design.author='default';



        $scope.saveChanges=function () {
            designService
                .saveChanges($scope.designs)
                .then(function (response) {
                    console.log('updating design',response);
                    initController();
                });
        };
        $scope.saveNewDesign=function () {
            var array = [];
            array.push($scope.design);
            designService
                .saveChanges(array)
                .then(function (response) {
                    console.log('saving new design',response);
                    initController();
                });
        };
        function initController() {
            designService.fetchAllDesigns()
                .then(function (response) {
                    console.log(response);
                    $scope.designs=response.data;
                });
        }
        initController();


    });