'use strict';

var utils = require('../utils/writer.js');
var Ugt = require('../service/UgtService');

module.exports.developersDeveloperKeyAppKeyUgtGET = function developersDeveloperKeyAppKeyUgtGET (req, res, next, developerKey, appKey, uuids) {
  Ugt.developersDeveloperKeyAppKeyUgtGET(developerKey, appKey, uuids)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.developersDeveloperKeyAppKeyUuidUgtGET = function developersDeveloperKeyAppKeyUuidUgtGET (req, res, next, uuid, developerKey, appKey) {
  Ugt.developersDeveloperKeyAppKeyUuidUgtGET(uuid, developerKey, appKey)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.developersDeveloperKeyAppKeyUuidUgtPOST = function developersDeveloperKeyAppKeyUuidUgtPOST (req, res, next, body, uuid, developerKey, appKey) {
  Ugt.developersDeveloperKeyAppKeyUuidUgtPOST(body, uuid, developerKey, appKey)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.userUuidUgtGET = function userUuidUgtGET (req, res, next, uuid) {
  Ugt.userUuidUgtGET(uuid)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};
