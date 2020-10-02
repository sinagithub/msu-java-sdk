package com.github.msu.sdk.request.enumerated;

public enum Param {
    ACTION,
    AMOUNT,
    CURRENCY,
    INSTALLMENTS,
    RETURNURL,
    INTERIMPAGEURL,
    CANCELURL,
    INTEGRATIONMODEL,
    SESSIONTYPE,
    SESSIONTOKEN,
    TOKEN,
    AUTH3DTOKEN,
    SUBACTION,
    ISREFUNDABLE,
    SESSIONEXPIRY,
    WALLET3DAUTH,
    PREAUTH,
    PREAUTHEXPIRY,
    RESPONSEFORMAT,
    APIVERSION,
    MAXSALEATTEMPTS,

    @Deprecated
    PAYMENTEXPIRY,
    @Deprecated
    WALLET_3D_AUTH,
    @Deprecated
    MAX_SALE_ATTEMPTS,


    POINTS, CAMPAIGNS,


    MERCHANT,
    MERCHANTPAYMENTID,
    MERCHANTUSER,
    MERCHANTPASSWORD,
    MERCHANTUSEREMAIL,
    MERCHANTIMG,
    RANDOM, // Random value for hash authentication
    HASH, // Hash value for authentication
    DISPLAYMERCHANTNAME,
    DISPLAYINSTALLMENTS,
    MERCHANTMOTTO,
    TEMPLATE,
    CARDUNIQUE,
    MERCHANTBUSINESSID,
    MERCHANTGROUPNAME,

    MERCHANTSYSTEMCUSTUMERID,
    CUSTOMER,
    CUSTOMERNAME,
    CUSTOMEREMAIL,
    CUSTOMERPHONE,
    CUSTOMERCARDTOKEN,
    CURRENTCUSTOMERID,
    NEWCUSTOMERID,


    LANGUAGE,
    TIMEZONE,

    PPBGCOLOR,
    PPTITLECOLOR,
    PPSECTIONTITLEBGCOLOR,
    PPLAYOUT,
    PPFONT,

    BACKGROUNDCOLOR,
    BORDERCOLOR,
    HEADERCOLOR,
    BUTTONCOLOR,
    FONT,
    LEFTLOGO,
    RIGHTLOGO,

    SHOWSSL,
    SHOWVISA,
    SHOWMC,
    SHOWAMEX,
    SHOWDINACARD,
    SHOWDINERS,
    SHOWJCB,
    SHOWTROY,


    @Deprecated
    ITEMNUM_CODE,
    @Deprecated
    ITEMNUM_NAME,
    @Deprecated
    ITEMNUM_PRICE,
    @Deprecated
    ITEMNUM_QUANTITY,
    @Deprecated
    ITEMNUM_DESCRIPTION,
    @Deprecated
    ITEMTOTALAMOUNT,
    @Deprecated
    SHIPPINGCOST,
    @Deprecated
    ITEMTAXINCLUDED,
    @Deprecated
    ITEMTAXAMOUNT,
    @Deprecated
    OTHEREXPENSES,


    SHIPTONAME,
    SHIPTOADDRESSLINE,
    SHIPTOCITY,
    SHIPTOSTATE,
    SHIPTOPOSTALCODE,
    SHIPTOCOUNTRY,
    SHIPTOPHONE,

    BILLTONAME,
    BILLTOADDRESSLINE,
    BILLTOCITY,
    BILLTOSTATE,
    BILLTOPOSTALCODE,
    BILLTOCOUNTRY,
    BILLTOPHONE,

    BIN, //
    ENCRYPTEDDATA,
    CARDTOKEN,
    CARDPAN,
    CARDEXPIRY,
    CARD_EXPIRY,
    CARDNAME,
    NAMEONCARD,
    CARDCVV,
    CARDSAVENAME,
    CARDNUMBER,
    CARDSTATUS,
    CAMPAIGNCODE,
    EXTRACAMPAIGNCODE,


    PAYMENTSYSTEM, // Payment system name

    PGTRANID,

    CARDHOLDERID,

    OFFSET, LIMIT,
    S_CARD_TOKEN,
	S_CARD_OWNER_MASKED,
	S_PAN_LAST4,
	S_NAME,
	S_CUSTOMER,
	S_CARD_BIN,
	S_CARD_BRAND,
    S_CARD_TYPE,
	S_CARD_LEVEL,
	S_CARD_NETWORK,
	S_CARD_COUNTRY_ISO,
	S_CARD_PAYMENT_SYSTEM,
	S_CARD_ISSUER,
    S_CARD_VIRTUAL,
	S_CARD_STATUS_AC,
	S_CARD_STATUS_DE,
	S_CARD_STATUS_WA,
	W_NAME,
	W_CARD_TOKEN,
	FORGROUP,
    BEGINDATE,
	ENDDATE,
	STARTDATE,
	SESSION_STATUS_AC,
	SESSION_STATUS_FI,
	TRANSACTION_STATUS_IP,
	TRANSACTION_STATUS_CA,
    TRANSACTION_STATUS_AP,
	TRANSACTION_STATUS_FA,
	TRANSACTION_STATUS_VD,
	TRANSACTION_STATUS_MR,
	TRANSACTION_STATUS_PA,
    TRANSACTION_STATUS_WA,
	TRANSACTION_STATUS_WFA,
	TRANSACTION_STATUS_WLA,
	TRANSACTION_STATUS_RJ,
    CARD_STATUS_AC,
	CARD_STATUS_DE,
	CARD_STATUS_WA,
	STATUSCHANGEBEGINDATE,
	STATUSCHANGEENDDATE,

    CANSAVECARD, SAVECARD, DISPLAYCVV, //

    TERMINALID, POSID, REDIRECTWAITINGTIME,

    NAME,

    INTERESTRATE,

    DISCOUNTRATE,

    COMMISSIONRATE,

    VALIDTO,

    VALIDFROM,

    PAYMENTTYPEID,

    COMMISSIONSTATUS,

    TRANSACTIONSTATUS,

    MERCHANTUSERID,

    MAXINSTALLMENTCOUNT,
    BUSINESSMAXINSTALLMENTCOUNT,

    RECURRINGPLANCODE,
    FIRSTAMOUNT,
    RECURRINGAMOUNT,
    FREQUENCY,
    RECURRENCE,
    RECURRENCECOUNT,
    STATUS,
    RECURRINGPLANSTATUS,
    RECURRINGPAYMENTSTATUS,
    OCCURRENCE,
    MERCHANTLOGO,
    ORDERITEMS,
    MERCHANTCONTENTID,
    THREATMETRIXSESSIONID,
    TMXSESSIONQUERYINPUT,

    BKMTOKEN,
    CUSTOMERIP,
    CARDHOLDERPORT,
    TRANSACTIONTYPE,
    CUSTOMERUSERAGENT,
    PGORDERID,
    BKMTRANSACTIONSTATUS,
    PGTRANAPPRCODE,
    PGTRANREFID,
    PGTRANERRORCODE,
    PGTRANRETURNCODE,
    PGTRANERRORTEXT,
    PGTRANDATE,
    EXTRA,
    PAYMENTSYSTEMTYPE,
    PAYMENTSYSTEMMODE,
    APIMERCHANTID,
    APIUSERNAME,
    APIPASSWORD,
    GATE3DKEY,
    ISDEFAULT,
    INTEGRATIONEXTRAFIELD00,
    INTEGRATIONEXTRAFIELD01,
    EFTCODE,
    SUBMERCHANTCODE,
    BANKMERCHANTID,

    PAYMENTSYSTEMTYPENAME,

    COMPAYTOKEN,

    COMPAYRESPONSECODE,

    PAYBYLINKTOKEN,
    CREATEDTS,
    DUEDATE,
    PAYBYLINKSTATUS,


    TITLE,
    CONTENT,
    MESSAGECONTENTTYPE,
    ISDISPLAYED,

    NOTIFICATIONCHANNELS,

    SPLITPAYMENTCODE,
    SPLITPAYMENTTYPE,


    APPLYFORBUSINESSCARD,
    APPLYFORCREDITCARD,
    APPLYFORDEBITCREDITCARD,

    PPOLICY,
    AMOUNTLIMIT,

    DEALERCODE,
    TCKN,
    VKN,
    PARENTDEALERCODE,
    CONTACTNAME,
    CONTACTEMAIL,
    CONTACTPHONE,
    CONTACTFAX,
    CONTACTPOSTCODE,
    CONTACTADDRESS,
    CONTACTWEBADDRESS,
    REASON,
    CITYID,

    TRANSACTIONID,
    DEALERCODES,
    SUBSTATUS,


    ROLE,
    USERNAME,
    MERCHANTUSERPASSWORD,
    CONFIRMPASSWORD,
    ISLOCKED,


    USERS,


    DEALERTYPENAME,
    DEALERTYPES,
    DESCRIPTIONREQUIRED,
    DESCRIPTIONPRESENT,
    DEFAULTSUBDEALERTYPE,
    PAYMENTSYSTEMS,
    PERMISSION,
    REFLECTCOMMISSION,
    IGNORERATES,
    PGTRANIDTOREFUND,
    MAXRESULT,
    AMOUNTLOWERLIMIT,
    AMOUNTUPPERLIMIT,


    INVOICEID,
    INVOICESTATUS,
    ISSUEDATE,
    ISSUEDATEEND,
    DUEDATEEND,
    ORIGINALAMOUNT,


    USEREMAIL,

    RECOVERYTOKEN,
    OLDPASSWORD,
    NEWPASSWORD,
    NEWPASSWORDCONFIRM,

    FEATURE,
    INITIATORMERCHANTBUSINESSID,
    INCLUDEDEALERS,

    RULE,

    PANIIN,
    PANLAST4,
    CARDHASH,
    ADJUSTRATES,


    COMMERCECODES,
    COMMERCECODE,
    RULENAME,
    DIVERTEDPSNAME,
    CARDBRAND,
    CARDTYPE,
    CARDNETWORK,
    ISSUER,
    COUNTRYISOA3,
    FOREIGN,
    DEFAULTONLY,
    EXPIRYMONTH,
    EXPIRYYEAR,

    CODE,
    BEHAVIOUR,
    AVAILABILITIES,
    GROUPS,
    HEADER,
    DEFINITION,
    TYPE,
    INTEGRATIONCODE,
    CUSTOMFIELDS,

    CUTOFFDAY,
    CARDCUTOFFDAY,
    SETTINGS,

    RULETYPE,
    PAYMENTSYSTEMRULESCOPE,
    PAYMENTSYSTEMLIST,
    RULECODE,

    ASSOCIATEDPAYMENTSYSTEMS,
    ASSOCIATEDMERCHANT,

    DEALERUSEREMAIL,

    CARDPANTYPE;
}