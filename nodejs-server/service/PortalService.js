'use strict';


/**
 * Retrieve portal information
 * Retrieve portal info for given id
 *
 * uid String Portal Unique Id
 * returns portal
 **/
exports.portalUidGET = function(uid) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "uid" : "uid",
  "elements" : [ null, null ],
  "skin" : "skin",
  "model" : "model"
};
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * Retrieve portals for user
 * Retrieve all portal info for the given user
 *
 * uuid String Unique User Id
 * returns List
 **/
exports.userUuidPortalsGET = function(uuid) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = [ {
  "uid" : "uid",
  "elements" : [ null, null ],
  "skin" : "skin",
  "model" : "model"
}, {
  "uid" : "uid",
  "elements" : [ null, null ],
  "skin" : "skin",
  "model" : "model"
} ];
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}

