'use strict';

var utils = require('../utils/writer.js');
var Session = require('../service/SessionService');

module.exports.developersDeveloperKeyAppKeySessionsUuidDELETE = function developersDeveloperKeyAppKeySessionsUuidDELETE (req, res, next, uuid, developerKey, sessionKey, appKey) {
  Session.developersDeveloperKeyAppKeySessionsUuidDELETE(uuid, developerKey, sessionKey, appKey)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.developersDeveloperKeyAppKeySessionsUuidPATCH = function developersDeveloperKeyAppKeySessionsUuidPATCH (req, res, next, body, uuid, developerKey, appKey) {
  Session.developersDeveloperKeyAppKeySessionsUuidPATCH(body, uuid, developerKey, appKey)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.developersDeveloperKeyAppKeySessionsUuidPOST = function developersDeveloperKeyAppKeySessionsUuidPOST (req, res, next, uuid, developerKey, appKey) {
  Session.developersDeveloperKeyAppKeySessionsUuidPOST(uuid, developerKey, appKey)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.developersDeveloperKeyAppKeySessionsUuidPUT = function developersDeveloperKeyAppKeySessionsUuidPUT (req, res, next, body, uuid, developerKey, appKey) {
  Session.developersDeveloperKeyAppKeySessionsUuidPUT(body, uuid, developerKey, appKey)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};
