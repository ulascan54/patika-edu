import { useState, useEffect } from "react"
import "./App.css"
import { IntlProvider, FormattedMessage, FormattedNumber } from "react-intl"
const messages = {
  "tr-TR": { title: "merhaba", description: "3 yeni mesajınız var" },
  "en-US": { title: "hello", description: "you have 3 new messages" },
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
          <FormattedMessage id="description" />
        </p>
        <button onClick={() => setLocale("tr-TR")}>TR</button>
        <button onClick={() => setLocale("en-US")}>EN</button>
      </IntlProvider>
    </div>
  )
}

export default App
