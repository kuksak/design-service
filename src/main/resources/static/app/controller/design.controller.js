/**
 * Created by Sakshi Kukreti on 27-04-2017.
 */

angular.module('app')
    .controller('designController', function ($scope, designService) {
        $scope.saveChanges = function () {
            $scope.showLoader = true;
            designService
                .saveChanges($scope.designs)
                .then(function (response) {
                    $scope.showLoader = false;
                    console.log('updating design', response);
                    initController();
                });
        };

        function initController() {
            $scope.showLoader = true;
            designService.fetchAllDesigns()
                .then(function (response) {
                    $scope.showLoader = false;
                    console.log(response);
                    $scope.designs = response.data;
                });

        }

        initController();
    });