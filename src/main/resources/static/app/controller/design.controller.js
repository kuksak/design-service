/**
 * Created by Sakshi Kukreti on 27-04-2017.
 */

angular.module('app')
    .controller('designController', function ($scope, designService) {
        $scope.saveChanges = function () {
            designService
                .saveChanges($scope.designs)
                .then(function (response) {
                    console.log('updating design', response);
                    initController();
                });
        };

        function initController() {
            designService.fetchAllDesigns()
                .then(function (response) {
                    console.log(response);
                    $scope.designs = response.data;
                });
        }

        initController();
    });