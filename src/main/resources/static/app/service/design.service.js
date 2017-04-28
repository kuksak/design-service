/**
 * Created by Sakshi Kukreti on 27-04-2017.
 */

angular.module('app')
    .service('designService', function ($http, $q) {
        var defer ;

        function handleSuccess(data) {
            defer = $q.defer();
            defer.resolve(data);
            return defer.promise;

        }

        function handleError(data) {
            defer = $q.defer();
            defer.reject(data);
            return defer.promise;
        }

        function fetchAllDesigns() {
            return $http.get('/service/all').then(handleSuccess, handleError);

        }

        function findDesign(designNum, author) {
            return $http.get('/service/' + designNum + '/' + author).then(handleSuccess, handleError);
        }

        function saveChanges(designs){
            return $http.post('/service/save' , designs).then(handleSuccess, handleError);
        }

        this.fetchAllDesigns = fetchAllDesigns;
        this.findDesign = findDesign;
        this.saveChanges = saveChanges;

    });

