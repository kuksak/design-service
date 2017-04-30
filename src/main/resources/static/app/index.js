/**
 * Created by Sakshi Kukreti on 26-04-2017.
 */


var app = angular.module('app', ['ui.router']);

app.config(function ($stateProvider, $urlRouterProvider) {
    var homeState = {
        name: 'homeState',
        url: '/home',
        templateUrl: '/app/view/home.view.html',
        controller: 'designController'
    };

    var createDesignState = {
        name: 'createDesignState',
        url: '/create',
        templateUrl: '/app/view/create.design.view.html',
        controller: 'createDesignController'
    };
    $stateProvider.state(homeState);
    $stateProvider.state(createDesignState);
    $urlRouterProvider.otherwise('/home');


});