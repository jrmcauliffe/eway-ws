// Generated by <a href="http://scalaxb.org/">scalaxb</a>.
package org.birchavenue.eway


case class CreateCustomer(createcustomersequence1: org.birchavenue.eway.CreateCustomerSequence1,
  createcustomersequence2: org.birchavenue.eway.CreateCustomerSequence2,
  createcustomersequence3: org.birchavenue.eway.CreateCustomerSequence3) {
  lazy val Title = createcustomersequence1.Title
  lazy val FirstName = createcustomersequence1.FirstName
  lazy val LastName = createcustomersequence1.LastName
  lazy val Address = createcustomersequence1.Address
  lazy val Suburb = createcustomersequence1.Suburb
  lazy val State = createcustomersequence1.State
  lazy val Company = createcustomersequence1.Company
  lazy val PostCode = createcustomersequence1.PostCode
  lazy val Country = createcustomersequence1.Country
  lazy val Email = createcustomersequence1.Email
  lazy val Fax = createcustomersequence2.Fax
  lazy val Phone = createcustomersequence2.Phone
  lazy val Mobile = createcustomersequence2.Mobile
  lazy val CustomerRef = createcustomersequence2.CustomerRef
  lazy val JobDesc = createcustomersequence2.JobDesc
  lazy val Comments = createcustomersequence2.Comments
  lazy val URL = createcustomersequence2.URL
  lazy val CCNumber = createcustomersequence2.CCNumber
  lazy val CCNameOnCard = createcustomersequence2.CCNameOnCard
  lazy val CCExpiryMonth = createcustomersequence2.CCExpiryMonth
  lazy val CCExpiryYear = createcustomersequence3.CCExpiryYear
}


case class CreateCustomerSequence1(Title: Option[String] = None,
  FirstName: Option[String] = None,
  LastName: Option[String] = None,
  Address: Option[String] = None,
  Suburb: Option[String] = None,
  State: Option[String] = None,
  Company: Option[String] = None,
  PostCode: Option[String] = None,
  Country: Option[String] = None,
  Email: Option[String] = None)

case class CreateCustomerSequence2(Fax: Option[String] = None,
  Phone: Option[String] = None,
  Mobile: Option[String] = None,
  CustomerRef: Option[String] = None,
  JobDesc: Option[String] = None,
  Comments: Option[String] = None,
  URL: Option[String] = None,
  CCNumber: Option[String] = None,
  CCNameOnCard: Option[String] = None,
  CCExpiryMonth: Int)

case class CreateCustomerSequence3(CCExpiryYear: Int)

case class CreateCustomerResponse(CreateCustomerResult: Option[String] = None)


case class EWAYHeader(eWAYCustomerID: Option[String] = None,
  Username: Option[String] = None,
  Password: Option[String] = None,
  attributes: Map[String, scalaxb.DataRecord[Any]])


case class UpdateCustomer(updatecustomersequence1: org.birchavenue.eway.UpdateCustomerSequence1,
  updatecustomersequence2: org.birchavenue.eway.UpdateCustomerSequence2,
  updatecustomersequence3: org.birchavenue.eway.UpdateCustomerSequence3) {
  lazy val managedCustomerID = updatecustomersequence1.managedCustomerID
  lazy val Title = updatecustomersequence1.Title
  lazy val FirstName = updatecustomersequence1.FirstName
  lazy val LastName = updatecustomersequence1.LastName
  lazy val Address = updatecustomersequence1.Address
  lazy val Suburb = updatecustomersequence1.Suburb
  lazy val State = updatecustomersequence1.State
  lazy val Company = updatecustomersequence1.Company
  lazy val PostCode = updatecustomersequence1.PostCode
  lazy val Country = updatecustomersequence1.Country
  lazy val Email = updatecustomersequence2.Email
  lazy val Fax = updatecustomersequence2.Fax
  lazy val Phone = updatecustomersequence2.Phone
  lazy val Mobile = updatecustomersequence2.Mobile
  lazy val CustomerRef = updatecustomersequence2.CustomerRef
  lazy val JobDesc = updatecustomersequence2.JobDesc
  lazy val Comments = updatecustomersequence2.Comments
  lazy val URL = updatecustomersequence2.URL
  lazy val CCNumber = updatecustomersequence2.CCNumber
  lazy val CCNameOnCard = updatecustomersequence2.CCNameOnCard
  lazy val CCExpiryMonth = updatecustomersequence3.CCExpiryMonth
  lazy val CCExpiryYear = updatecustomersequence3.CCExpiryYear
}


case class UpdateCustomerSequence1(managedCustomerID: Long,
  Title: Option[String] = None,
  FirstName: Option[String] = None,
  LastName: Option[String] = None,
  Address: Option[String] = None,
  Suburb: Option[String] = None,
  State: Option[String] = None,
  Company: Option[String] = None,
  PostCode: Option[String] = None,
  Country: Option[String] = None)

case class UpdateCustomerSequence2(Email: Option[String] = None,
  Fax: Option[String] = None,
  Phone: Option[String] = None,
  Mobile: Option[String] = None,
  CustomerRef: Option[String] = None,
  JobDesc: Option[String] = None,
  Comments: Option[String] = None,
  URL: Option[String] = None,
  CCNumber: Option[String] = None,
  CCNameOnCard: Option[String] = None)

case class UpdateCustomerSequence3(CCExpiryMonth: Int,
  CCExpiryYear: Int)


case class UpdateCustomerResponse(UpdateCustomerResult: Boolean)


case class QueryCustomer(managedCustomerID: Long)


case class QueryCustomerResponse(QueryCustomerResult: Option[org.birchavenue.eway.CreditCard] = None)


case class CreditCard(ManagedCustomerID: Long,
  CustomerRef: Option[String] = None,
  CustomerTitle: Option[String] = None,
  CustomerFirstName: Option[String] = None,
  CustomerLastName: Option[String] = None,
  CustomerCompany: Option[String] = None,
  CustomerJobDesc: Option[String] = None,
  CustomerEmail: Option[String] = None,
  CustomerAddress: Option[String] = None,
  CustomerSuburb: Option[String] = None,
  CustomerState: Option[String] = None,
  CustomerPostCode: Option[String] = None,
  CustomerCountry: Option[String] = None,
  CustomerPhone1: Option[String] = None,
  CustomerPhone2: Option[String] = None,
  CustomerFax: Option[String] = None,
  CustomerURL: Option[String] = None,
  CustomerComments: Option[String] = None,
  CCName: Option[String] = None,
  CCNumber: Option[String] = None,
  CCExpiryMonth: Option[String] = None,
  CCExpiryYear: Option[String] = None) extends ManagedCustomerable


trait ManagedCustomerable {
  val ManagedCustomerID: Long
  val CustomerRef: Option[String]
  val CustomerTitle: Option[String]
  val CustomerFirstName: Option[String]
  val CustomerLastName: Option[String]
  val CustomerCompany: Option[String]
  val CustomerJobDesc: Option[String]
  val CustomerEmail: Option[String]
  val CustomerAddress: Option[String]
  val CustomerSuburb: Option[String]
  val CustomerState: Option[String]
  val CustomerPostCode: Option[String]
  val CustomerCountry: Option[String]
  val CustomerPhone1: Option[String]
  val CustomerPhone2: Option[String]
  val CustomerFax: Option[String]
  val CustomerURL: Option[String]
  val CustomerComments: Option[String]
}


case class ManagedCustomer(ManagedCustomerID: Long,
  CustomerRef: Option[String] = None,
  CustomerTitle: Option[String] = None,
  CustomerFirstName: Option[String] = None,
  CustomerLastName: Option[String] = None,
  CustomerCompany: Option[String] = None,
  CustomerJobDesc: Option[String] = None,
  CustomerEmail: Option[String] = None,
  CustomerAddress: Option[String] = None,
  CustomerSuburb: Option[String] = None,
  CustomerState: Option[String] = None,
  CustomerPostCode: Option[String] = None,
  CustomerCountry: Option[String] = None,
  CustomerPhone1: Option[String] = None,
  CustomerPhone2: Option[String] = None,
  CustomerFax: Option[String] = None,
  CustomerURL: Option[String] = None,
  CustomerComments: Option[String] = None) extends ManagedCustomerable


case class QueryCustomerByReference(CustomerReference: Option[String] = None)


case class QueryCustomerByReferenceResponse(QueryCustomerByReferenceResult: Option[org.birchavenue.eway.CreditCard] = None)


case class ProcessPayment(managedCustomerID: Long,
  amount: Int,
  invoiceReference: Option[String] = None,
  invoiceDescription: Option[String] = None)


case class ProcessPaymentResponse(ewayResponse: Option[org.birchavenue.eway.CCPaymentResponse] = None)


case class CCPaymentResponse(ewayTrxnError: Option[String] = None,
  ewayTrxnStatus: Option[String] = None,
  ewayTrxnNumber: Option[String] = None,
  ewayReturnAmount: Option[String] = None,
  ewayAuthCode: Option[String] = None)


case class ProcessPaymentWithBeagle(managedCustomerID: Long,
  amount: Int,
  invoiceReference: Option[String] = None,
  invoiceDescription: Option[String] = None,
  cvn: Option[String] = None,
  ipAddress: Option[String] = None,
  billingCountry: Option[String] = None)


case class ProcessPaymentWithBeagleResponse(ewayResponse: Option[org.birchavenue.eway.CCPaymentResponse] = None)


case class ProcessPaymentWithCVN(managedCustomerID: Long,
  amount: Int,
  invoiceReference: Option[String] = None,
  invoiceDescription: Option[String] = None,
  cvn: Option[String] = None)


case class ProcessPaymentWithCVNResponse(ewayResponse: Option[org.birchavenue.eway.CCPaymentResponse] = None)


case class QueryPayment(managedCustomerID: Long)


case class QueryPaymentResponse(QueryPaymentResult: Option[org.birchavenue.eway.ArrayOfManagedTransaction] = None)


case class ArrayOfManagedTransaction(ManagedTransaction: Option[org.birchavenue.eway.ManagedTransaction]*)


case class ManagedTransaction(TotalAmount: Int,
  Result: Int,
  ResponseText: Option[String] = None,
  TransactionDate: javax.xml.datatype.XMLGregorianCalendar,
  ewayTrxnNumber: Int)

