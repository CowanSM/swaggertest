'use strict';

var utils = require('../utils/writer.js');
var Dev = require('../service/DevService');

module.exports.pingGET = function pingGET (req, res, next) {
  Dev.pingGET()
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.rootGET = function rootGET (req, res, next, testq) {
  Dev.rootGET(testq)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};
