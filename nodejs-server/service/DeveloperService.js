'use strict';


/**
 * End a Session
 * End an active session for an user.
 *
 * uuid String User Unique Id
 * developerKey String Developer Api Key
 * sessionKey String Session Key from POST
 * appKey String App Api Key
 * returns ApiResponse
 **/
exports.developersDeveloperKeyAppKeySessionsUuidDELETE = function(uuid,developerKey,sessionKey,appKey) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "code" : 0,
  "type" : "type",
  "message" : "message"
};
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * Pause Or Resume Session
 * Pause or Resume a session without ending the session
 *
 * body Sessions_uuid_body Has relevant session info for update.
 * uuid String User Unique Id
 * developerKey String Developer Api Key
 * appKey String App Api Key
 * returns ApiResponse
 **/
exports.developersDeveloperKeyAppKeySessionsUuidPATCH = function(body,uuid,developerKey,appKey) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "code" : 0,
  "type" : "type",
  "message" : "message"
};
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * Start a Session
 * Start a Session for the user
 *
 * uuid String User Unique Id
 * developerKey String Developer Api Key
 * appKey String App Api Key
 * returns inline_response_200
 **/
exports.developersDeveloperKeyAppKeySessionsUuidPOST = function(uuid,developerKey,appKey) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "response" : {
    "code" : 0,
    "type" : "type",
    "message" : "message"
  },
  "session" : {
    "sessionKey" : "sessionKey",
    "ttl" : 0
  }
};
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * Keep-Alive a Session
 * Keep an active session for an user alive
 *
 * body SessionInfo Has relevant session info for update.
 * uuid String User Unique Id
 * developerKey String Developer Api Key
 * appKey String App Api Key
 * returns ApiResponse
 **/
exports.developersDeveloperKeyAppKeySessionsUuidPUT = function(body,uuid,developerKey,appKey) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "code" : 0,
  "type" : "type",
  "message" : "message"
};
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * Retrieve ugts for given user ids.
 * Retrieve all UGTs for a set of supplied user ids.
 *
 * developerKey String Developer Api Key
 * appKey String App Api Key
 * uuids List Uuid List
 * returns portal
 **/
exports.developersDeveloperKeyAppKeyUgtGET = function(developerKey,appKey,uuids) {
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
 * Fetch UGT for user.
 * Get the UGT set by user for the given developer-app key pair.
 *
 * uuid String User Unique Id
 * developerKey String Developer Api Key
 * appKey String App Api Key
 * returns inline_response_200_1
 **/
exports.developersDeveloperKeyAppKeyUuidUgtGET = function(uuid,developerKey,appKey) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "ugt" : {
    "owner" : "owner",
    "uid" : "uid",
    "name" : "name"
  },
  "apiResponse" : {
    "code" : 0,
    "type" : "type",
    "message" : "message"
  }
};
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * Set UGT for user.
 * Set the UGT for given user and the developer-app key pair.
 *
 * body Uuid_ugt_body Contains the (valid) ugt to set for the given user/app pair.
 * uuid String User Unique Id
 * developerKey String Developer Api Key
 * appKey String App Api Key
 * returns ApiResponse
 **/
exports.developersDeveloperKeyAppKeyUuidUgtPOST = function(body,uuid,developerKey,appKey) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "code" : 0,
  "type" : "type",
  "message" : "message"
};
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}

