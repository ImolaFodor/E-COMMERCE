var app = angular.module('app', ['ui.router', 'ngSanitize', 'ngMessages', 'ngMaterial', 'translation', 'flow', 'scDateTime']);

app.constant('GENDERS', ['MALE', 'FEMALE']);
app.constant('POSETA_STATUS', ['PRIHVACENO', 'ODBIJENO', 'NEODLUCENO'])

app.config(function($stateProvider, $urlRouterProvider, $translateProvider, $httpProvider, $mdThemingProvider, $mdDateLocaleProvider){

    $urlRouterProvider.otherwise('/login');
    $stateProvider
        .state('login', {
            url: '/login',
            templateUrl: 'module/login.html',
            controller: 'login'
        }).state('main', {
            url: '/',
            abstract: true,
            templateUrl: 'module/main.html',
            controller: 'main'
        })

        .state('main.prodavnice', {
            url: 'prodavnice',
            templateUrl: 'module/prodavnice/prodavnicaManagment.html',
            controller: 'prodavnicaManagmentController'
        })
        .state('main.user', {
            url: 'user',
            templateUrl: 'module/user/userMain.html',
            controller: 'userMain'
        })
        .state('main.pocetna', {
            url: 'pocetna',
            templateUrl: 'module/pocetna/pocetna.html',
            controller: 'pocetnaController'
        })
        .state('main.kupovine', {
            url: 'kupovine',
            templateUrl: 'module/kupovine/kupovineLista.html',
            controller: 'kupovineListaController'
        })
        .state('main.kupovine.korpa', {
            url: 'korpa',
            templateUrl: 'module/kupovine/korpa/korpa.html',
            controller: 'korpaController'
        });

    //Ne radi UTF-8 sa ovim
    //$translateProvider.useSanitizeValueStrategy('sanitize');

    $mdThemingProvider.theme('default')
        .primaryPalette('light-green')
        .accentPalette('indigo');


    $mdDateLocaleProvider.formatDate = function(date) {
        return moment(date).format('DD-MM-YYYY');
    };


});