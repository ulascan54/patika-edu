import { useState, useEffect } from "react"
import "./App.css"
import { IntlProvider, FormattedMessage, FormattedNumber } from "react-intl"
const messages = {
  "tr-TR": { title: "merhaba", description: "{count} yeni mesajınız var" },
  "en-US": { title: "hello", description: "you have {count} new messages" },
}
function App() {
  const defaultLocale = navigator.language
  const isLocale = localStorage.getItem("locale")

  const [locale, setLocale] = useState(isLocale ? isLocale : defaultLocale)

  useEffect(() => {
    localStorage.setItem("locale", locale)
  }, [locale])
  return (
    <div className="App">
      <IntlProvider locale={locale} messages={messages[locale]}>
        <FormattedMessage id="title" />
        <p>
          <FormattedMessage id="description" values={{ count: 5 }} />
        </p>
        <button onClick={() => setLocale("tr-TR")}>TR</button>
        <button onClick={() => setLocale("en-US")}>EN</button>
      </IntlProvider>
    </div>
  )
}

export default App
