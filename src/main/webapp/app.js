var app=angular.module('app', []);


app.controller('PostsController', function ($scope,PostsService) {

        $scope.postArray=new Array();

        $scope.postArray=PostsService.fetch(function (res) {
            console.log("cococo")
            $scope.postArray=res.data;
        });

        $scope.sharePostAction= function () {
            if($scope.postBody){
                var post=
                {
                    username:'zeros',
                    postBody:$scope.postBody
                };

                PostsService.save(post);
                $scope.postArray.unshift(post);
                $scope.postBody=null;
            }
        };
    });

app.service('PostsService', function ($http) {

        this.save=function(post){
            // SAVE NEW POST
        };

        this.fetch= function () {
            return $http.get('http://localhost:8080/api/post');
        };
    });

