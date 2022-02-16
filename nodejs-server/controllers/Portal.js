'use strict';

var utils = require('../utils/writer.js');
var Portal = require('../service/PortalService');

module.exports.portalUidGET = function portalUidGET (req, res, next, uid) {
  Portal.portalUidGET(uid)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.userUuidPortalsGET = function userUuidPortalsGET (req, res, next, uuid) {
  Portal.userUuidPortalsGET(uuid)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};
