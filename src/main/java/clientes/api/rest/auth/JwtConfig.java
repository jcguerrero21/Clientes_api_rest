package clientes.api.rest.auth;

public class JwtConfig {
	public static final String LLAVE_SECRETA = "alguna.clave.secreta.deloitte.12345678";
	
	public static final String RSA_PRIVADA = "-----BEGIN RSA PRIVATE KEY-----\r\n" + 
			"MIIEowIBAAKCAQEA4B9jR0GngDqMQrQTElPLBW8clMGne+5so30nGz5xKbxFspHG\r\n" + 
			"MME1XfeHLncd0ovPKKeLNK3EpNJLWC1Q3pecaFcUeHUMEVE7IJuAnG3sCLOTixrx\r\n" + 
			"97RYg3hHh6iTUwmiXHtCgIZYR9M3tDfP003vyA+r5p3aIdI7VIswFTUG3X2+iV16\r\n" + 
			"s+2ZOau93i9DScMuxgqVb3FnAxyDrxRIwJeRmwFVMvWdkhRvBW1o/Ci2WN7b++WR\r\n" + 
			"fkr5IuwBWY1b3v+EVWyRVSQHzhwWTBlcv3VMgXE1r2zE83V3FqVCxW9cH+r4j6CB\r\n" + 
			"vIonCgVTDRIqOT5C7F/EHHhHnbchNYE5/aZRfQIDAQABAoIBAGoDbtqN28Vz7FTB\r\n" + 
			"CSRqLmZroIFc+PROW2UaFh108+JiBDXrbmwxeCTyqSb5gUnOiDcayWYprBKqxqj3\r\n" + 
			"BoHEBV/1kOFJvGOUoPtTkwprlHKpPulV3Y7l59iIVI1+1/E3ZW2JgHN7GNcgugCt\r\n" + 
			"RckV3I4tm4qCsGO/JgFftWbSpmSt6474U6v/RL4cezzPLVy3MRmo7NNAzVX1XQpB\r\n" + 
			"zrSPQYWKghd9/o2KEKvRUnGJTQd9hwrsYqu0/DRfRteOmkwNM8hIMw1RoUkqiYEA\r\n" + 
			"e3w/6GFZf4HyYhnBLzOxCQXCBVnyIkBiEsR8DCixc09vH57NDGv51dZzp9jpP+Sk\r\n" + 
			"CJ1ruwECgYEA8FpANLVyRDlL6fWuxKZVodU9+mFjUC/1duS7CHIkhpvD72ZpyC2G\r\n" + 
			"BbzJogEv4KMZlOU+A2F3c5w/H/dJL4jJ1UFf25N0Pn+GQG1dH9v0JlXNHs5ssmVf\r\n" + 
			"a/OPc+1LMlzpUvXyM14OOD4ssvejKir46X5Gbni6F5fIIL1A2COTpOkCgYEA7ral\r\n" + 
			"iu4B5jufxF9VAZy3wlBP0oO8S+KF9byuy/r17r90TOBMfmw29OVDI6UweRTAEhnd\r\n" + 
			"BWyikYniO+bg/rr2VFOSIf2ic+20AT7G1lFGk+SsE3st40jjsccOK/BtiP53//Su\r\n" + 
			"nEVjrorbw2vCg3mnOvdDZxQKTtZslXZvcV1we3UCgYAR60iaJWTtfTARs0ViV9xO\r\n" + 
			"gm1qe1RCKDEuugLPsGLUvkwvTv1X9TzmtJp7v4boQoCnvyeObPfQ4Lc8FN2Z86LI\r\n" + 
			"iWUyI54pAqzppL2qoGVlbkQqpc0ox7IDhFcPl4Nhr9edXcS+26ZHvyrp9NhvTmDc\r\n" + 
			"V5O8rLeDBsfe2P06n/xj8QKBgEa4peK7EKT9FSBAfha0L1zKHlvn22k/+yAKfl7A\r\n" + 
			"QwwwfGwqJ39s3/s90N5Gmk3E8AJs1yY8QQ2NJBFLHW1aRpBFEg4v7mkaCzIzPwVP\r\n" + 
			"nvFB1hkPbVDgz1Rj/LbXzBvCCBs0imaRyC51xRXoXwBEkl7N0pI/Ra6FqDW/mNSl\r\n" + 
			"MiXhAoGBALli4pQ1VfNIb8W/mIQBd6TpfFzDYaHGoBOeO8om4jz2G82e1B2+UJ2S\r\n" + 
			"Mkd6JHLhZ2Eu+UQ04wIUcJrsjfIm/gli8x8O8qWXThlAcfvFCehWbopQ7BRBW6nz\r\n" + 
			"jbQKIwZbFJDEJQu7HMBiHhBak03PczlXd1mQEEqtArf3qUSBfx0t\r\n" + 
			"-----END RSA PRIVATE KEY-----";
	
	public static final String RSA_PUBLICA = "-----BEGIN PUBLIC KEY-----\r\n" + 
			"MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA4B9jR0GngDqMQrQTElPL\r\n" + 
			"BW8clMGne+5so30nGz5xKbxFspHGMME1XfeHLncd0ovPKKeLNK3EpNJLWC1Q3pec\r\n" + 
			"aFcUeHUMEVE7IJuAnG3sCLOTixrx97RYg3hHh6iTUwmiXHtCgIZYR9M3tDfP003v\r\n" + 
			"yA+r5p3aIdI7VIswFTUG3X2+iV16s+2ZOau93i9DScMuxgqVb3FnAxyDrxRIwJeR\r\n" + 
			"mwFVMvWdkhRvBW1o/Ci2WN7b++WRfkr5IuwBWY1b3v+EVWyRVSQHzhwWTBlcv3VM\r\n" + 
			"gXE1r2zE83V3FqVCxW9cH+r4j6CBvIonCgVTDRIqOT5C7F/EHHhHnbchNYE5/aZR\r\n" + 
			"fQIDAQAB\r\n" + 
			"-----END PUBLIC KEY-----";
	
}
